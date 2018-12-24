package com.zensar.springboot.service;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.zensar.springboot.model.Price;
import com.zensar.springboot.model.Product;
import com.zensar.springboot.model.Products;

@Service("productFilterService")
public class ProductFilterServiceImpl implements ProductFilterService {

	public static final Logger log = LoggerFactory.getLogger(ProductFilterServiceImpl.class);

	@Override
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.zensar.springboot.service.ProductFilterService#allProducts(com.zensar.
	 * springboot.model.Product)
	 */
	public List<Products> allProducts(Product product) {

		ArrayList<Products> prds = (ArrayList<Products>) product.getProducts();

		Iterator<Products> p = prds.iterator();
		while (p.hasNext()) {
			Products pr1 = p.next();
			Price price = pr1.getPrice();

			log.info("Product found with Id:" + pr1.getProductId() + " was: " + price.getWas() + " now: "
					+ price.getNow() + " then1:" + price.getThen1() + " then2:" + price.getThen2());
		}
		return prds;

	}

	@Override
	/**
	 * Retrieve only products that match the filter criteria: ie Products with Price
	 * reduction, sorted on reduction amount- high to low Each product should have:
	 * productId title colorSwatches nowPrice: £x.xx rgbColor: hex representation of
	 * basicColor priceLabel reduction error handling
	 * 
	 */
	public List<Products> priceReducedProducts(Product product, String labelType) {

		// Get all products
		List<Products> rawProds = (ArrayList<Products>) product.getProducts();
		List<Products> result = new ArrayList<Products>();

		// Iterate over all
		Iterator<Products> tempPrd = rawProds.iterator();
		while (tempPrd.hasNext()) {

			Products filteredPrd = tempPrd.next();
			Price price = filteredPrd.getPrice();

			//Check if now price is present and valid (non-empty)
			Optional<String> nowOptional = Optional.ofNullable(price.getNow());
			BigDecimal now = new BigDecimal(nowOptional.isPresent() ? price.getNow() : "0.0");

			//Check if was price is present and valid (non-empty)
			Optional<String> wasOptional = Optional.ofNullable(price.getWas());
			BigDecimal was = new BigDecimal(wasOptional.isPresent() ? price.getWas() : "0.0");

			// Populate priceLabel
			filteredPrd.setPriceLabel(getPriceLabel(filteredPrd, labelType, now, was));

			// Populate reduction
			double reduction = (now.subtract(was)).doubleValue();
			filteredPrd.setReduction(reduction);

			// REQUIREMENT: Add the £ symbol to now price
			price.setNow("£" + price.getNow());

			log.info("Product Id:" + filteredPrd.getProductId() + " was: " + price.getWas() + " now: " + price.getNow()
					+ " then1:" + price.getThen1() + " then2:" + price.getThen2());

			filteredPrd.setPrice(price);

			// REQUIREMENT: This product is eligible to be included in results if it has a price reduction!
			if (Double.compare(reduction, 0.0) == -1)
				result.add(filteredPrd);
		}

		// REQUIREMENT: Sort as highest reduction product first
		Collections.sort(result);
		return result;
	}

	/**
	 * Create priceLabel to be added to Products instance
	 * 
	 * @param filteredPrd
	 * @param labelType
	 * @param now
	 * @param was
	 * @return
	 */
	private String getPriceLabel(Products filteredPrd, String labelType, BigDecimal now, BigDecimal was) {
		Price price = filteredPrd.getPrice();

		//Check if then1 price is present and valid (non-empty)
		Optional<String> then1Optional = Optional.ofNullable(price.getThen1());
		BigDecimal then1 = new BigDecimal(then1Optional.isPresent() ? price.getThen1() : "0.0");

		//Check if then2 price is present and valid (non-empty)
		Optional<String> then2Optional = Optional.ofNullable(price.getThen2());
		BigDecimal then2 = new BigDecimal(then2Optional.isPresent() ? price.getThen2() : "0.0");

		// REQUIREMENT: Populate priceLabel
		String priceLabel = "";

		if (labelType != null) {

			// For values that are integer, if they are less £10 return a decimal price,
			// otherwise show an
			// integer price, e.g. “£2.00” or “£10”.
			if (labelType.equals("ShowWasNow"))
				priceLabel = "“Was £" + was + ", now £"
						+ (now.intValue() < 10 ? (now.setScale(2, BigDecimal.ROUND_DOWN)) : now.intValue());

			else if (labelType.equals("ShowWasThenNow")) {

				// REQUIREMENT: If then2 is not empty, use then2 instead of then1
				//ie If the original price.then2 is not empty use that for the “then” price otherwise use
				//the then1 price. If the then1 price is also empty then don’t show the “then” price.
				
				if (then2Optional.get() != null)
					priceLabel = "Was £" + was + ", then £" + then2 + ", now\n" + "£" + now;
				// If then2 is empty, use then 1
				priceLabel = "Was £" + was + ", then £" + then1 + ", now\n" + "£" + now;

			}

			else if (labelType.equals("ShowPercDscount")) {

				// REQUIREMENT: Calculate discount only if was price is NON-ZERO and WAS PRICE
				// IS HIGHER THAN
				// NOW PRICE
				if (!(was.compareTo(BigDecimal.ZERO) == 0) && now.subtract(was).doubleValue() < 0) {
					BigDecimal percentOff = now.multiply(new BigDecimal(100)).divide(was, 2, RoundingMode.HALF_UP);
					priceLabel = percentOff + "% off - now £" + now;
				}
			}
		}
		log.info("priceLabel: " + priceLabel);
		return priceLabel;
	}
}
