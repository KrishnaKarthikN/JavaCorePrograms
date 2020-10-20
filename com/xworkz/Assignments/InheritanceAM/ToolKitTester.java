package com.xworkz.Assignments.InheritanceAM;

public class ToolKitTester extends ToolKit{
	
	public static void main(String[] args) {
		
		ToolKit toolKit = new ToolKit();
		toolKit.brand = "Bosch";
		toolKit.price = 4749.00;
		System.out.println("Brand : " + toolKit.brand);
		System.out.println("Price : " + toolKit.price);
		toolKit.hasAllenKeys();
		toolKit.hasSpiritLevel();
	}
	
}
/*Output : 
Brand : Bosch
Price : 4749.0
kit Contains Allen keys
Kit has Spirit-Level and Measuring-Tape 
*/
