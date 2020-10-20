package com.xworkz.Assignments.InheritanceAM;

public class ToolKit {

	String brand;
	double price;
	
	private void hasScrewBits() {
		System.out.println("Kit contains all drilling bit ");//Cannot be instantiated in child class by creating an instance
	}
//	default void hammerDrill() {
//		System.out.println("Kit contains 550W 10mm Hammer Drill ");//Default methods are allowed only in interfaces.
//	}	
	protected void hasAllenKeys() {
		System.out.println("kit Contains Allen keys");
	}
	public void hasSpiritLevel() {
		System.out.println("Kit has Spirit-Level and Measuring-Tape ");
	}
}
