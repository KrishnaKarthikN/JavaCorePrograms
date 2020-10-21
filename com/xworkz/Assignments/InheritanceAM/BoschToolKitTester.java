package com.xworkz.Assignments.InheritanceAM;

public class BoschToolKitTester {
	
	public static void main(String[] args) {
		
		ToolKit boschToolKit = new BoschToolKit();
		boschToolKit.brand = "Bosch";
		boschToolKit.price = 4749.00;
		System.out.println("Brand : " + boschToolKit.brand);
		System.out.println("Price : " + boschToolKit.price);
		//boschToolKit.hasScrewBits();//The method hasScrewBits() from the type ToolKit is not visible
		boschToolKit.hammerDrill();
		boschToolKit.hasAllenKeys();
		boschToolKit.hasSpiritLevel();
		
		
		
	}
	
}
