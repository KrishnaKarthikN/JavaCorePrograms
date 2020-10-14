package com.xworkz.inheritance.assignments;

public class BikeNS extends Bike {
	public Boolean abs = true ;
	public Boolean gearIndicator = true;

	public void connectivity() {
		System.out.println("Bluetooth Connectivity Present");
	}

	public void drive() {
		System.out.println("Smooth Drive with mono suspension");
	}

}
