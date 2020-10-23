package com.xworkz.AnonymousClasses.Assignments;

public interface Masks {

	void wearing();
	void hasCarbonFilter();
	default void isn95() {
		System.out.println("Mask Is N95");
	}
	
}
