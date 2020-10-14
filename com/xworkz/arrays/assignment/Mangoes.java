package com.xworkz.arrays.assignment;

public class Mangoes {


		String type;
		double price;
		String color = "saffron";
		String place;
		
		public Mangoes(String Inname,int Inprice , String Inplace) {
			type = Inname;
			price = Inprice;
			place = Inplace;
		}
		
		
		void displayDetails() {
			
			System.out.println("Type : " + type + " ;" + " Price per kg : " + price + " ;" + " Color : " + color + " ;" + " Native Place : " + place);
			
		}
		
		
		
}




	
	
	

