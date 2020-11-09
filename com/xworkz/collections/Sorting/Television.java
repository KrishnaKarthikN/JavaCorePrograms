package com.xworkz.collections.Sorting;

public class Television {

	private String brand;
	private int inches;
	private double price;
	private String type;

	public Television(String brand, int inches, double price, String type) {
		super();
		this.brand = brand;
		this.inches = inches;
		this.price = price;
		this.type = type;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getInches() {
		return inches;
	}
	public void setInches(int inches) {
		this.inches = inches;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Television [brand=" + brand + ", inches=" + inches + ", price=" + price + ", type=" + type + "]";
	}
	
	
	
	
}
