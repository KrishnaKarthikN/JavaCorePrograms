package com.xworkz.Assignments.InheritanceAM;

public class BoschToolKit extends ToolKit{
	
	
//	@Override
//	void hasScrewBits(){
//		       //The method hasScrewBits() of type BoschToolKit must override or implement a supertype method                                       
//	}
	@Override
	void hammerDrill(){
		System.out.println("Advanced 550W 10mm Hammer Drill");
	}
	
//	@Override
//	public void hasAllenkeys() {
//		
//	}            //The method hasAllenkeys() of type BoschToolKit must override or implement a supertype method
	@Override
	public void hasSpiritLevel() {
		System.out.println("Advanced Spirit-Level Measurement tools and Measuring Tapes");
	}
}
