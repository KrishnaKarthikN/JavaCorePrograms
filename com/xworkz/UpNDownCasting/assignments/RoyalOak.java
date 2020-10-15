package com.xworkz.UpNDownCasting.assignments;

public class RoyalOak {

	private String brand;
	private String sizeType ;
	private double price;
	
	RoyalOak(){
		System.out.println("Default constructor");
	}

	public RoyalOak(String brand, String sizeType, double price) {
		super();
		this.brand = brand;
		this.sizeType = sizeType;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getSizeType() {
		return sizeType;
	}

	public void setSizeType(String sizeType) {
		this.sizeType = sizeType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	void displayDetails() {
		System.out.println("Brand : "+ brand + " Size Type : " + sizeType + " Price : " + price);
	}
	
	
}
