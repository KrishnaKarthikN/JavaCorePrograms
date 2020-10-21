package com.xworkz.interfaceInheritance.assignmnets;

public class Watch {

	String brand;
	double price;
	String dialColor;
	boolean isStainless;
	
	Watch(){
		System.out.println("Default Constructors");
	}

	/**
	 * @param brand
	 * @param price
	 * @param dialColor
	 * @param isStainless
	 */
	public Watch(String brand, double price, String dialColor, boolean isStainless) {
		this();
		this.brand = brand;
		this.price = price;
		this.dialColor = dialColor;
		this.isStainless = isStainless;
		
	}
	void displayDetails() {
		System.out.println("Brand : "+ this.brand + " ; Price : " + this.price + " ; Dial-Color : " + this.dialColor + " ; Is Stainless : " + this.isStainless);
	}
	
}
