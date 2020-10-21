package com.xworkz.interfaceInheritance.assignmnets;

public class MysoreSandalSoapTester extends MysoreSandalSoap {

	public static void main(String[] args) {
		System.out.println("Parent classes are Soap & Essance And child class is MysoreSandalSoap");
		MysoreSandalSoap mysoreSandalSoap = new MysoreSandalSoap();
		mysoreSandalSoap.contents();//Inherited from Soap
		mysoreSandalSoap.fragrance();//Inherited from Essance
		mysoreSandalSoap.skinType();//Inherited from Soap
		
	}

}

/* Outputs;
Parent classes are Soap & Essance And child class is MysoreSandalSoap
  
Soap is made from vegetable oils that contain pure natural Mysore Sandalwood Oil, along with skincare conditioners & moisturizers.
Long-lasting fragrance
Mysore Sandal Soap is suitable for all skin types.
 */