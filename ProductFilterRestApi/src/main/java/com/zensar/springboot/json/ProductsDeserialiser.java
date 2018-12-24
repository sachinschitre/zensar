package com.zensar.springboot.json;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.zensar.springboot.model.ColorSwatches;
import com.zensar.springboot.model.Price;
import com.zensar.springboot.model.Products;
import com.zensar.springboot.util.ColorPalette;
import com.zensar.springboot.util.ColorUtil;

@SuppressWarnings("serial")
public class ProductsDeserialiser extends StdDeserializer<Products> {

	private static final Logger log = LoggerFactory.getLogger(ProductsDeserialiser.class);

	public ProductsDeserialiser() {
		this(null);
	}

	public ProductsDeserialiser(Class<?> vc) {
		super(vc);
	}

	@Override
	public Products deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		
		
		JsonNode node = jp.getCodec().readTree(jp);
		JsonNode id = node.get("productId");
		JsonNode title = node.get("title");

		// Populate a new Products object, fill it with data from JSON Node and return
		Products product = new Products();
		List<ColorSwatches> swatches=new ArrayList<ColorSwatches>();
		
		// Fetch Price as PATH NODE
		JsonNode priceNode = node.path("price");
		Price price = getPrice(priceNode);

		// Populate Price
		product.setPrice(price);

		// Populate colorSwatches
		JsonNode cSwNode = node.path("colorSwatches");
		swatches=getColorSwatches(cSwNode);
		product.setColorSwatches(swatches);

		product.setProductId(id.asText());
		product.setTitle(title.asText());

		return product;
	}

	/**
	 * Fetch list of ColorSwatches
	 * @param cSwNode
	 * @return
	 */
	public List<ColorSwatches> getColorSwatches(JsonNode cSwNode) {
		
		List<ColorSwatches> swatches = new ArrayList<ColorSwatches>();
		ColorSwatches swatch=null;

		
		// Fetch the colorSwatches node
		for (JsonNode node1 : cSwNode) {
			swatch = new ColorSwatches();
			String color = node1.path("color").asText();
			String basicColor = node1.path("basicColor").asText();
			String skuId = node1.path("skuId").asText();
			
			
			// REQUIREMENT: Populate rgbColor for each ColorSwatches node
			Color basicCOLOR = ColorPalette.getColor(basicColor);
			swatch.setRgbColor(ColorUtil.getRgbColor(basicCOLOR));
			
			swatch.setBasicColor(basicColor);
			swatch.setColor(color);
			swatch.setSkuId(skuId);
			
			swatches.add(swatch);
		}
		log.info("Swatches size: "+swatches.size());
		return swatches;

	}

	/**
	 * Get the Price instance to be attached to the Products
	 * @param priceNode
	 * @return
	 */
	public Price getPrice(JsonNode priceNode) {

		Price price = new Price();

		if (priceNode.isArray()) {
			// If this node an Arrray?
		}

		Optional<JsonNode> wasOptional = null, nowOptional = null, then1Optional = null, then2Optional = null;
		JsonNode was = null, now = null, then1 = null, then2 = null;
		// Fetch the price node
		// for (JsonNode node1 : priceNode) {

		was = priceNode.get("was");
		wasOptional = Optional.ofNullable(was);

		now = priceNode.get("now");
		nowOptional = Optional.ofNullable(now);

		then1 = priceNode.get("then1");
		then1Optional = Optional.ofNullable(then1);

		then2 = priceNode.get("then2");
		then2Optional = Optional.ofNullable(then2);
		// }

		String now1 = (now.asText().isEmpty()) ? "0.0" : now.asText();
		String was1 = (was.asText().isEmpty()) ? "0.0" : was.asText();

		String thn1 = (then1.asText().isEmpty()) ? "0.0" : then1.asText();
		String thn2 = (then2.asText().isEmpty()) ? "0.0" : then2.asText();

		price.setNow(nowOptional.isPresent() ? now1 : "");
		price.setWas(wasOptional.isPresent() ? was1 : "");
		price.setThen1(then1Optional.isPresent() ? thn1 : "");
		price.setThen2(then2Optional.isPresent() ? thn2 : "");

		return price;

	}
}
