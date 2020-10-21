package com.xworkz.interfaceInheritance.assignmnets;

public class MamaEarthShampAndCondnr implements Shampoo, Conditioner  {

	@Override
	public void primaryPacking() {
		// TODO Auto-generated method stub
		Conditioner.super.primaryPacking();
	}

	//Duplicate default methods named primaryPacking with the parameters () and () are inherited from the types Conditioner and Shampoo
	//Compiler asks us to override default methods in either of Parent classes
	
	
	
	
}
