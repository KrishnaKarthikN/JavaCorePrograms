package com.xworkz.arrays.assignment;

public class CricketBatsTester {

		public static void main(String[] args) {
			System.out.println("Comparing few best Cricket bats & their specifications");
			
			CricketBats[] cricketBat = new CricketBats[3];
			
			CricketBats ss = new CricketBats("SS",23200,1290,42);
			ss.willowtype = "English willow";
			cricketBat[0] = ss;
			
			CricketBats gm = new CricketBats("GM",24575,1210,38);
			cricketBat[1] = gm;
			
			CricketBats spartan = new CricketBats("Spartan",38318,1250,40);
			cricketBat[2] = spartan;
			
			System.out.println();
	
			
			System.out.println("Using For Loop");
			
			for(int i=0; i<cricketBat.length ; i++) {
				if(cricketBat[i] != null) {
				CricketBats temp = cricketBat[i];

				temp.displayDetails();
				}
			}
			System.out.println();
			System.out.println("Using Enhanced For loop");
			for(CricketBats cb : cricketBat) {
				if (cb != null)
					cb.displayDetails();
			}
			
	}

}
	
	

