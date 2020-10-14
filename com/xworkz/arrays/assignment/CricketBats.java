package com.xworkz.arrays.assignment;


public class CricketBats {

	String willowtype = "Kashmir Willow";
	int price;
	int weightIngms;
	int edgeThickness;
	String name ;

	public CricketBats(String Inname,int Inprice , int InweightIngms , int InedgeThickness) {
		name = Inname;
		price = Inprice;
		weightIngms = InweightIngms;
		edgeThickness = InedgeThickness;
	}
	void displayDetails() {
		
		System.out.println("Company : " + name + " ;" + " Willow Type : " + willowtype + " ;" + " Price : " + price + " ;" + " Weight in grams : " + weightIngms + " ;" + " Edge Thickness : " + edgeThickness);
		
	}	
	
}
