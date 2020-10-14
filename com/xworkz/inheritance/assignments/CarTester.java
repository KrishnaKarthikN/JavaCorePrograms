package com.xworkz.inheritance.assignments;

public class CarTester {

	public static void main(String[] args) {
		
		LuxuryCar lc = new LuxuryCar();
		System.out.println("The Company : " + lc.brand);		
		System.out.println("The Type : " + lc.type);
		System.out.println("The Name : " + lc.name);
		System.out.println("EmissionNorm : " + lc.emisionNorm);
		System.out.println("The BootCapacity : " + lc.bootspace);
		
		System.out.println();
	
		lc.calling(9741988288l);
		lc.engine(1497);
		lc.gps();
		lc.mileage(15);
		lc.tankCapacity(45);
		lc.luxury();
		lc.sunroof();
	}
	
}
