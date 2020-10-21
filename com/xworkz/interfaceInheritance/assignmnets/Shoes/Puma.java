package com.xworkz.interfaceInheritance.assignmnets.Shoes;

public class Puma implements WalkingShoes {

	@Override
	public void closureType() {
		System.out.println("Slip On");
	}

	@Override
	public void useFor() {
		System.out.println("Walking");
	}

	@Override
	public void outerMaterial() {
		System.out.println("Mesh");
	}

	@Override
	public void heelType() {
		System.out.println("Flat");
	}

}
