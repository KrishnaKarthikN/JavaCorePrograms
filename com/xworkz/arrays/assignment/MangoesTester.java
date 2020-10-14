package com.xworkz.arrays.assignment;

public class MangoesTester {
	public static void main(String[] args) {
		
		Mangoes[] mangoes = new Mangoes[3];
		
		Mangoes alphonso = new Mangoes("Alphonso", 275, "Ratnagiri & Maharastra");
		alphonso.color = "Sun-Shine Yellow  ";
		mangoes[0] = alphonso;
		
		Mangoes kesar = new Mangoes("Kesar", 130, "Gujurat");
		mangoes[1] = kesar;
		Mangoes badami = new Mangoes("Badami", 100, "North-Karnataka");
		mangoes[2] = badami;
		
		System.out.println("Types of mangoes");
		System.out.println();
		System.out.println("Using For Loop");
		
		for(int i=0; i<mangoes.length ; i++) {
			if(mangoes[i] != null) {
			Mangoes temp = mangoes[i];
			//System.out.println("Apple array values : " + temp);
			temp.displayDetails();
			}
		}
		System.out.println();
		System.out.println("Using Enhanced For loop");
		for(Mangoes mango : mangoes) {
			if (mango != null)
				mango.displayDetails();
		}

		
		
		
	}
}
