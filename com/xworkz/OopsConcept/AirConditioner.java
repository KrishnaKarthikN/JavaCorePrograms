package com.xworkz.OopsConcept;

public class AirConditioner {
	String brand;
	String condenserCoil;
	int price;
	int noiseLeveldB;
	
	AirConditioner() {
	System.out.println("Types of AC");
	}
	
	AirConditioner(int cost , String cc){//initializing price and coil type
		price = cost;
		condenserCoil = cc;
	}
	AirConditioner(String bnd, String cc, int cost, int noisedB) { // initializing all parameters
		
		brand = bnd;
		condenserCoil = cc;
		price = cost ;
		noiseLeveldB = noisedB;
	}


	public void cooling(int temp) {
		System.out.println("Cool to temperature" + temp);
	
	}

	
	
}
