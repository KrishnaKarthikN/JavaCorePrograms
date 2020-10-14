package com.xworkz.OopsConcept;

public class Book {
	String company;
	String type;
	int price;
	int numberOfPages;
	
	Book(){
		System.out.println("Write");
	}
	Book(int cost , String typ){//initializing price and type
		price = cost;
		type = typ;
	}
	Book(String comp, String typ, int cost, int numpages) {
		
		company = comp;
		type = typ;
		price = cost;
		numberOfPages = numpages;
	}
	public void writing() {
		System.out.println("Write your name");
	} 
	public void draw() {
		System.out.println("Draw something");
	}
}
