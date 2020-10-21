package com.xworkz.interfaceInheritance.assignmnets.Shoes;

public class AdidasTester extends Adidas {

	public static void main(String[] args) {
		
		Adidas adidas = new Adidas();
		adidas.closureType();
		adidas.useFor();
		adidas.outerMaterials();
		adidas.toeStyle();
		
	}

}

/*Outputs:
LaceUp
Gym & Running
Synthetic
Round Toe
*/