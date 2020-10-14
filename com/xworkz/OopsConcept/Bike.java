package com.xworkz.OopsConcept;

public class Bike {
	String brand;
	String color;
	int transmission;
	String emissionNorm;
	
	
	public void engine(float cc) {
		System.out.println(" Engine : " + cc + "cc");
	}
	public void range(int mileage) {
		System.out.println(" Range : " + mileage + "km");
	}
	public void tankCapacity(float ltrs) {
		System.out.println("tank Capacity : " + ltrs + "ltrs");
	}
	
}
