package com.zensar.springboot.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.zensar.springboot.json.ProductsDeserialiser;

@JsonIgnoreProperties
({"type","code","averageRating","reviews","additionalServices","image",
	"displaySpecialOffer","promoMessages","nonPromoMessage","defaultSkuId",
	"colorSwatchSelected","colorWheelMessage", "outOfStock", 
	"emailMeWhenAvailable","availabilityMessage", 
	"compare", "fabric", "swatchAvailable", 
	"categoryQuickViewEnabled","swatchCategoryType","brand",
	"ageRestriction", "isInStoreOnly", "isMadeToMeasure", 
	"isBundle", "isProductSet","promotionalFeatures", 
	"features", "dynamicAttributes","directorate", 
	"releaseDateTimestamp","rgbColor"
	})

@JsonDeserialize(using = ProductsDeserialiser.class)
public class Products implements Comparable<Products> {

	private String productId;
	private String type;
	private String title;
	private String code;
	private int averageRating;
	private int reviews;
	private Price price;
	private String image;
	private List<AdditionalServices> additionalServices;
	private String displaySpecialOffer;
	private PromoMessages promoMessages;
	private String nonPromoMessage;
	private String defaultSkuId;
	private List<ColorSwatches> colorSwatches;
	private int colorSwatchSelected;
	private String colorWheelMessage;
	private boolean outOfStock;
	private boolean emailMeWhenAvailable;
	private String availabilityMessage;
	private boolean compare;
	private String fabric;
	private boolean swatchAvailable;
	private boolean categoryQuickViewEnabled;
	private String swatchCategoryType;
	private String brand;
	private int ageRestriction;
	private boolean isInStoreOnly;
	private boolean isMadeToMeasure;
	private boolean isBundle;
	private boolean isProductSet;
	private List<PromotionalFeatures> promotionalFeatures;
	private List<Features> features;
	private DynamicAttributes dynamicAttributes;
	private String directorate;
	private int releaseDateTimestamp;

	// New fields added
	private String priceLabel;
	private String rgbColor;
	private double reduction;

	public double getReduction() {
		return reduction;
	}

	public void setReduction(double reduction) {
		this.reduction = reduction;
	}

	public String getRgbColor() {
		return rgbColor;
	}

	public void setRgbColor(String rgbColor) {
		this.rgbColor = rgbColor;
	}

	public String getPriceLabel() {
		return priceLabel;
	}

	public void setPriceLabel(String priceLabel) {
		this.priceLabel = priceLabel;
	}

	public void setInStoreOnly(boolean isInStoreOnly) {
		this.isInStoreOnly = isInStoreOnly;
	}

	public void setMadeToMeasure(boolean isMadeToMeasure) {
		this.isMadeToMeasure = isMadeToMeasure;
	}

	public void setBundle(boolean isBundle) {
		this.isBundle = isBundle;
	}

	public void setProductSet(boolean isProductSet) {
		this.isProductSet = isProductSet;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String input) {
		this.productId = input;
	}

	public String getType() {
		return type;
	}

	public void setType(String input) {
		this.type = input;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String input) {
		this.title = input;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String input) {
		this.code = input;
	}

	public int getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(int input) {
		this.averageRating = input;
	}

	public int getReviews() {
		return reviews;
	}

	public void setReviews(int input) {
		this.reviews = input;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price input) {
		this.price = input;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String input) {
		this.image = input;
	}

	public List<AdditionalServices> getAdditionalServices() {
		return additionalServices;
	}

	public void setAdditionalServices(List<AdditionalServices> input) {
		this.additionalServices = input;
	}

	public String getDisplaySpecialOffer() {
		return displaySpecialOffer;
	}

	public void setDisplaySpecialOffer(String input) {
		this.displaySpecialOffer = input;
	}

	public PromoMessages getPromoMessages() {
		return promoMessages;
	}

	public void setPromoMessages(PromoMessages input) {
		this.promoMessages = input;
	}

	public String getNonPromoMessage() {
		return nonPromoMessage;
	}

	public void setNonPromoMessage(String input) {
		this.nonPromoMessage = input;
	}

	public String getDefaultSkuId() {
		return defaultSkuId;
	}

	public void setDefaultSkuId(String input) {
		this.defaultSkuId = input;
	}

	public List<ColorSwatches> getColorSwatches() {
		return colorSwatches;
	}

	public void setColorSwatches(List<ColorSwatches> input) {
		this.colorSwatches = input;
	}

	public int getColorSwatchSelected() {
		return colorSwatchSelected;
	}

	public void setColorSwatchSelected(int input) {
		this.colorSwatchSelected = input;
	}

	public String getColorWheelMessage() {
		return colorWheelMessage;
	}

	public void setColorWheelMessage(String input) {
		this.colorWheelMessage = input;
	}

	public boolean getOutOfStock() {
		return outOfStock;
	}

	public void setOutOfStock(boolean input) {
		this.outOfStock = input;
	}

	public boolean getEmailMeWhenAvailable() {
		return emailMeWhenAvailable;
	}

	public void setEmailMeWhenAvailable(boolean input) {
		this.emailMeWhenAvailable = input;
	}

	public String getAvailabilityMessage() {
		return availabilityMessage;
	}

	public void setAvailabilityMessage(String input) {
		this.availabilityMessage = input;
	}

	public boolean getCompare() {
		return compare;
	}

	public void setCompare(boolean input) {
		this.compare = input;
	}

	public String getFabric() {
		return fabric;
	}

	public void setFabric(String input) {
		this.fabric = input;
	}

	public boolean getSwatchAvailable() {
		return swatchAvailable;
	}

	public void setSwatchAvailable(boolean input) {
		this.swatchAvailable = input;
	}

	public boolean getCategoryQuickViewEnabled() {
		return categoryQuickViewEnabled;
	}

	public void setCategoryQuickViewEnabled(boolean input) {
		this.categoryQuickViewEnabled = input;
	}

	public String getSwatchCategoryType() {
		return swatchCategoryType;
	}

	public void setSwatchCategoryType(String input) {
		this.swatchCategoryType = input;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String input) {
		this.brand = input;
	}

	public int getAgeRestriction() {
		return ageRestriction;
	}

	public void setAgeRestriction(int input) {
		this.ageRestriction = input;
	}

	public boolean getIsInStoreOnly() {
		return isInStoreOnly;
	}

	public void setIsInStoreOnly(boolean input) {
		this.isInStoreOnly = input;
	}

	public boolean getIsMadeToMeasure() {
		return isMadeToMeasure;
	}

	public void setIsMadeToMeasure(boolean input) {
		this.isMadeToMeasure = input;
	}

	public boolean getIsBundle() {
		return isBundle;
	}

	public void setIsBundle(boolean input) {
		this.isBundle = input;
	}

	public boolean getIsProductSet() {
		return isProductSet;
	}

	public void setIsProductSet(boolean input) {
		this.isProductSet = input;
	}

	public List<PromotionalFeatures> getPromotionalFeatures() {
		return promotionalFeatures;
	}

	public void setPromotionalFeatures(List<PromotionalFeatures> input) {
		this.promotionalFeatures = input;
	}

	public List<Features> getFeatures() {
		return features;
	}

	public void setFeatures(List<Features> input) {
		this.features = input;
	}

	public DynamicAttributes getDynamicAttributes() {
		return dynamicAttributes;
	}

	public void setDynamicAttributes(DynamicAttributes input) {
		this.dynamicAttributes = input;
	}

	public String getDirectorate() {
		return directorate;
	}

	public void setDirectorate(String input) {
		this.directorate = input;
	}

	public int getReleaseDateTimestamp() {
		return releaseDateTimestamp;
	}

	public void setReleaseDateTimestamp(int input) {
		this.releaseDateTimestamp = input;
	}

	/**
	 * Compare two Products based on the price reduction field
	 */
	@Override
	public int compareTo(Products that) {

		return Double.compare(this.reduction, that.reduction);

	}
}