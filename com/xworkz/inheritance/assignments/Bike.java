package com.xworkz.inheritance.assignments;

public class Bike {
	public String brand = "Bajaj";
	public String color = "Black" ;
	int transmission = 6;
	String emissionNorm = "BS VI";
	
	
	public void engine(float cc) {
		System.out.println(" Engine : " + cc + "cc");
	}
	public void range(int mileage) {
		System.out.println(" Range : " + mileage + "km");
	}
	public void tankCapacity(float ltrs) {
		System.out.println(" tank Capacity : " + ltrs + "ltrs");
	}
	
}