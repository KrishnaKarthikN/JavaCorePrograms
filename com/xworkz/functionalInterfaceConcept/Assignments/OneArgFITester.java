package com.xworkz.functionalInterfaceConcept.Assignments;

public class OneArgFITester {           // add 5 to the input parameter a (i.e a+5).


	public static void main(String[] args) {
		
		OneArgFI oneArgFI = (y)->{
					y = y + 5 ;
					System.out.println("Output of a+5 = " + y);
			return y;
		};
		oneArgFI.incrementBy5(5);
		
		
	}
	
}
//Output : Output of a+5 = 10