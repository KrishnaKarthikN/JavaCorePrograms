package com.xworkz.functionalInterfaceConcept.Assignments;

public class TwoArgFITester {

	public static void main(String[] args) {
		
		TwoArgFI twoArgFI = (str1 , str2)->{
			System.out.println("After Concatinating Strings : " + str1+str2);
			return str1+str2;
		};
		twoArgFI.concatTwoStrings("Krishna", "Karthik");
		
	}

}
// Output : After Concatinating Strings : KrishnaKarthik 