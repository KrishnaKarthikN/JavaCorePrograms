package com.xworkz.functionalInterfaceConcept.Assignments;

public class NoArgFITester {
	
	public static void main(String[] args) {
		
		NoArgFI noArgFI = ()->{
			String s = "Hello World!!";
					System.out.println(s);
			return s;
			};
			noArgFI.printHello();
		
		
	}

}
//Output : Hello World!!