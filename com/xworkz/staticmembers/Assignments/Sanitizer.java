package com.xworkz.staticmembers.Assignments;

public class Sanitizer {
	String brand;
	String color;
	Double price;
	boolean spray;
	{
		brand = "lifebouy";
		color = "Orange";
	} 
	{
		spray = false;
		price = 250.00;
	}
	Sanitizer(){
		System.out.println("Brand : "+ brand + " Color : " + color + " Spray : " + spray + " Price : "+ price );
	}
	Sanitizer(String inBrand, String inColor, boolean inSpray, double inPrice){
		String brand = inBrand;
		String color = inColor;
		boolean spray = inSpray;
		double price = inPrice;
		System.out.println("Brand : "+ brand + " Color : " + color + " Spray : " + spray + " Price : "+ price );
	}
	
	
	
	
}
