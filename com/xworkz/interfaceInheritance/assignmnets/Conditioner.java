package com.xworkz.interfaceInheritance.assignmnets;

public interface Conditioner {

	default void usedFor() {
		System.out.println("Hair care product used to improve the feel, appearance and manageability of hair");
	}
	default void primaryPacking() {
		System.out.println("Unbreakable PP or PEHD or PET container");
	}
	
}
