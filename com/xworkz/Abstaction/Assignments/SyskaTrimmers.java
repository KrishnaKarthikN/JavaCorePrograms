package com.xworkz.Abstaction.Assignments;

public class SyskaTrimmers extends Trimmers {

	@Override
	void trimmingBeard() {
		System.out.println("Bread Trimming");
	}

	@Override
	void hairTrimming(boolean x) {
		System.out.println("Hair Trimming can be done? : " + x);
	}

	
	
}
