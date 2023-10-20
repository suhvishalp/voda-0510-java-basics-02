package com.way2learnonline.model;

import org.springframework.beans.factory.annotation.Value;

public class ShapeGuess {
	
	
	@Value("#{T(java.lang.Math).random() * 100 }")
	private double initialShapeSeed;
	
	private String locale;

	public double getInitialShapeSeed() {
		return initialShapeSeed;
	}

	public void setInitialShapeSeed(double initialShapeSeed) {
		System.out.println("inside setInitialShapeSeed ...."+initialShapeSeed);
		this.initialShapeSeed = initialShapeSeed;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		//System.out.println("Locale is "+locale);
		this.locale = locale;
	}
	
	
	

}
