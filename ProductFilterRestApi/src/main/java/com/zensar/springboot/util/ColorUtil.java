package com.zensar.springboot.util;

import java.awt.Color;

public class ColorUtil {

	Color red,green,blue,pink,orange,purple,white,multi,yellow,black;
	
	static int rgbColor;
	
	
	public static String getRgbColor(Color basicColor) {
		
		
		rgbColor=basicColor.getRGB();
		String hex = "#"+Integer.toHexString(rgbColor).substring(2);
		//return String.valueOf(rgbColor);
		return hex;
		
	}
}
