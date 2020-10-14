package com.xworkz.OopsConcept;

public class Car {
	String brand;
	String type;
	String emmisionNorm;
	int bootspace;

	public void calling(long phoneNum) {
		System.out.println("Dialing..." + phoneNum);
	}
	public void engine(int cc) {
		System.out.println("Engine Capacity " + cc + "cc");
	}
	public void transport(float mileage) {
		System.out.println("Car Mileage " + mileage + "km");
	}
	public void tankCapacity(int ltrs) {
		System.out.println("tank Capacity " + ltrs + "ltrs");
	}
	public void gps() {
		System.out.println("navigating to home");
	}
	
}
