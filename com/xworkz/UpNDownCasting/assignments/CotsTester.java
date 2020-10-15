package com.xworkz.UpNDownCasting.assignments;

public class CotsTester  {
	public static void main(String[] args)  {
		
		System.out.println(" !!UpCasting!! ");
		
		RoyalOak royalOak =  new Cots(165.50, true);
		royalOak.setBrand("RoyalOak Zaper");
		royalOak.setSizeType("Queen");		
		royalOak.setPrice(33494);
		royalOak.displayDetails();
		/* !!UpCasting!! 
		Default constructor
		Brand : RoyalOak Zaper; Size Type : Queen; Price : 33494.0; Weight In Kgs : 165.5; Hydraulic true */
		System.out.println();
		
		System.out.println(" !!DownCasting!! ");
		
		Cots cots = (Cots) new RoyalOak("RoyalOak Aletta"," Queen ",31100);
		cots.setWeight(165.50);
		cots.setHydraulic(false);
		cots.displayDetails();
		/*  !!DownCasting!! 
		Exception in thread "main" java.lang.ClassCastException: com.xworkz.UpNDownCasting.assignments.RoyalOak cannot be cast to com.xworkz.UpNDownCasting.assignments.Cots
		at com.xworkz.UpNDownCasting.assignments.CotsTester.main(CotsTester.java:18)*/
	}
}
