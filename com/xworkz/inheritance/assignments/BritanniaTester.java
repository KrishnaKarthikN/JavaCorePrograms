package com.xworkz.inheritance.assignments;

public class BritanniaTester {
	public static void main(String[] args) {
		
		Britannia bt = new Britannia();
		System.out.println("The Company : "+ bt.company);
		System.out.println("Package type : "+ bt.packed);
		System.out.println("Milk Type : " + bt.milkType);
		System.out.println("Presence of salt : " + bt.salt);
		System.out.println("Is Processed : " + bt.processed );
		
		System.out.println();
		
		bt.prevent();
		bt.protein();
		bt.sandwich();
		
	
	
	}
}
