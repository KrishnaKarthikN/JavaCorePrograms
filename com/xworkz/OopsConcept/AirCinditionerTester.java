package com.xworkz.OopsConcept;

public class AirCinditionerTester {
	public static void main(String[] args) {
		System.out.println("AirConditioner 1");
		
		AirConditioner voltas = new AirConditioner();
		System.out.println("Brand : " + voltas.brand);
		System.out.println("CondenserCoil : " + voltas.condenserCoil);
		System.out.println("Price : " + voltas.price);
		System.out.println("Noise levels : " + voltas.noiseLeveldB);
		
		System.out.println();
		
		System.out.println("AirConditioner 2");
		
		AirConditioner samsung = new AirConditioner(33999 , "Alloy");
		System.out.println("Brand : " + samsung.brand);
		System.out.println("CondenserCoil : " + samsung.condenserCoil);
		System.out.println("Price : " + samsung.price);
		System.out.println("Noise levels : " + samsung.noiseLeveldB);
		
		System.out.println();
		
		System.out.println("AirConditioner 3");
		
		AirConditioner lg = new AirConditioner("LG" , "Copper" , 36490 , 26);
		System.out.println("Brand : " + lg.brand);
		System.out.println("CondenserCoil : " + lg.condenserCoil);
		System.out.println("Price : " + lg.price);
		System.out.println("Noise levels : " + lg.noiseLeveldB);

	
	
	
	}
}
