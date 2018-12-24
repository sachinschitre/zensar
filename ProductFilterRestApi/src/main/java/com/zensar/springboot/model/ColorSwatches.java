package com.zensar.springboot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"imageUrl","isAvailable","available","basicColor","colorSwatchUrl" } )

public class ColorSwatches {
	
	String color;
	String basicColor;
	String colorSwatchUrl;
	String imageUrl;
	boolean isAvailable;
	String skuId;
	String rgbColor;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBasicColor() {
		return basicColor;
	}
	public void setBasicColor(String basicColor) {
		this.basicColor = basicColor;
	}
	public String getColorSwatchUrl() {
		return colorSwatchUrl;
	}
	public void setColorSwatchUrl(String colorSwatchUrl) {
		this.colorSwatchUrl = colorSwatchUrl;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public String getSkuId() {
		return skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}
	
	public String getRgbColor() {
		return rgbColor;
	}
	public void setRgbColor(String rgbColor) {
		this.rgbColor = rgbColor;
	}
	

}





