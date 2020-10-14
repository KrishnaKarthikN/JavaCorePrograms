package com.xworkz.inheritance.assignments;

public class BikeTester {
	
		public static void main(String[] args) {
			
			System.out.println("Entered Bike name Pulsar ns 200");
			BikeNS ns200 = new BikeNS();
			System.out.println("Brand : " + ns200.brand);
			System.out.println("Color : " + ns200.color);
			System.out.println("Transmission : " + ns200.transmission);
			System.out.println("Emission Norm : " + ns200.emissionNorm);
			
			System.out.println("Has ABS : "+ ns200.abs);
			System.out.println("Has gear indicator :"+ ns200.gearIndicator);
			
			ns200.engine(199);
			
			ns200.range(425);
			
			ns200.tankCapacity(13);
			
			ns200.connectivity();
			ns200.drive();
			
}
}
