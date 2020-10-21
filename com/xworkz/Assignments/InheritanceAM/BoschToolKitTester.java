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
/*Output : 
Brand : Bosch
Price : 4749.0
Advanced 550W 10mm Hammer Drill
kit Contains Allen keys
Advanced Spirit-Level Measurement tools and Measuring Tapes.
*/
