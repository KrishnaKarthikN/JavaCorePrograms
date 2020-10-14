package com.xworkz.OopsConcept;

public class BikeTester {
	public static void main(String[] args) {
		
		System.out.println("Entered Bike name Pulsar ns 200");
		Bike ns200 = new Bike();
		ns200.brand = "BAJAJ";
		ns200.color = "BLACK";
		ns200.transmission = 6 ;
		ns200.emissionNorm = "BS VI";
		
		float cc = 199.5f;
		ns200.engine(cc);
		int mileage = 420;
		ns200.range(mileage);
		float ltrs = 13;
		ns200.tankCapacity(ltrs);
		
		System.out.println();
		
		System.out.println("Entered Bike name Apache RTR 200");
		Bike apache200 = new Bike();
		apache200.brand = "TVS";
		apache200.color = "RED";
		apache200.transmission = 5 ;
		apache200.emissionNorm = "BS VI";
		
		cc = 197.75f;
		apache200.engine(cc);
		mileage = 444;
		apache200.range(mileage);
		ltrs = 12;
		apache200.tankCapacity(ltrs);
		
		System.out.println();
		
		System.out.println("Entered Bike name Classic 350");
		Bike classic350 = new Bike();
		classic350.brand = "Royal Enfield";
		classic350.color = "Black";
		classic350.transmission = 6 ;
		classic350.emissionNorm = "BS VI";
		
		cc = 346;
		classic350.engine(cc);
		mileage = 472;
		classic350.range(mileage);
		ltrs = 13.5f;
		classic350.tankCapacity(ltrs);
	}
}
