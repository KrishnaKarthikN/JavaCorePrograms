package com.xworkz.StringConcept.Assignments;

public class CloneableTester {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		CloneableInterface cloneableInterface = new CloneableInterface("Hello" , "World");
		
		CloneableInterface clone = (CloneableInterface)cloneableInterface.clone();
	
					System.out.println(clone.str + clone.str1);
					
	
	}

}
//Output: HelloWorld