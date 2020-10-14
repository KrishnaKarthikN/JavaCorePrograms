package com.xworkz.inheritance.assignments;

public class AmulTester {
	public static void main(String[] args) {
		
		Amul al = new Amul();
		System.out.println("The Company : "+ al.company);
		System.out.println("Package type : "+ al.packed);
		System.out.println("Milk Type : " + al.milkType);
		System.out.println("Presence of salt : " + al.salt);
		System.out.println("Is Processed : " + al.processed );
		
		System.out.println();
		
		al.prevent();
		al.protein();
		al.burger();
		
	
	
	}
}
