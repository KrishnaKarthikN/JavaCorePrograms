package com.xworkz.interfaceInheritance.assignmnets;

public interface Shampoo {

	default void microBiological() {
		System.out.println("Watch micro-bacteriological quality specifications");
	}
	default void primaryPacking() {
		System.out.println("Unbreakable PP or PEHD or PET container");
	}
}
