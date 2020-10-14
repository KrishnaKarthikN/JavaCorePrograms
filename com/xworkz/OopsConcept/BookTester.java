package com.xworkz.OopsConcept;

public class BookTester {
	public static void main(String[] args) {
		System.out.println("Book 1");
		
		Book camlin = new Book();
		System.out.println("Company : " + camlin.company);
		System.out.println("Type : " + camlin.type);
		System.out.println("Price : " + camlin.price);
		System.out.println("Number of pages : " + camlin.numberOfPages);
		
		System.out.println();
		
		System.out.println("Book 2");
		
		Book navneet = new Book(25 , "Ruled");
		System.out.println("Company : " + navneet.company);
		System.out.println("Type : " + navneet.type);
		System.out.println("Price : " + navneet.price);
		System.out.println("Number of pages : " + navneet.numberOfPages);
		
		System.out.println();
		
		System.out.println("Book 3");
		
		Book classmate = new Book("Classmate" , "Unruled" , 50 , 140);
		System.out.println("Company : " + classmate.company);
		System.out.println("Type : " + classmate.type);
		System.out.println("Price : " + classmate.price);
		System.out.println("Number of pages : " + classmate.numberOfPages);
		
	
	
	
	
	}
	
}
