package com.xworkz.collections.LinkedList;

public class SoftDrinks {

	private String company;
	private double quantityLtrs;
	private int price;
	
	public SoftDrinks(String company, double quantity, int price) {
		super();
		this.company = company;
		this.quantityLtrs = quantity;
		this.price = price;
	}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public double getQuantity() {
		return quantityLtrs;
	}
	public void setQuantity(double quantity) {
		this.quantityLtrs = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "SoftDrinks [company=" + company + ", quantity=" + quantityLtrs + ", price=" + price + "]";
	}
	
	
	
	
	
}
