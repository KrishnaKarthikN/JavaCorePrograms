package com.xworkz.interfaceInheritance.assignmnets;

public class MysoreSandalSoap implements Soap, Essance {

	@Override
	public void contents() {
		System.out.println("Soap is made from vegetable oils that contain pure natural Mysore Sandalwood Oil, along with skincare conditioners & moisturizers.");

	}
	
	@Override
	public void fragrance() {
		System.out.println("Long-lasting fragrance");
	}

	@Override
	public void skinType() {
		System.out.println("Mysore Sandal Soap is suitable for all skin types.");		
	}




}
