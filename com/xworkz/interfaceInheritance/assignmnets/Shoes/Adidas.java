package com.xworkz.interfaceInheritance.assignmnets.Shoes;

public class Adidas implements GymShoes {

	@Override
	public void closureType() {
		System.out.println("LaceUp");
	}

	@Override
	public void useFor() {
		System.out.println("Gym & Running");
	}

	@Override
	public void outerMaterials() {
		System.out.println("Synthetic");
	}

	@Override
	public void toeStyle() {
		System.out.println("Round Toe");
	}

}
