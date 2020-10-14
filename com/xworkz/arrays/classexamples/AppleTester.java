package com.xworkz.arrays.classexamples;

public class AppleTester {

	public static void main(String[] args) {
		
		Apple[] applesArray = new Apple[5];
		
		Apple shimla = new Apple();
		shimla.price = 180;
		shimla.type = "Shimla";
		shimla.weight = 0.75f;
		//shimla.displayDetails();
		
		applesArray[0] = shimla;
		
		Apple kashmir = new Apple();
		kashmir.price = 200;
		kashmir.type = "Kashmir";
		kashmir.weight = 1.00f;
		//kashmir.displayDetails();
		
		applesArray[1] = kashmir;
		
		System.out.println("Using For Loop");
		
		for(int i=0; i<applesArray.length ; i++) {
			if(applesArray[i] != null) {
			Apple temp = applesArray[i];
			//System.out.println("Apple array values : " + temp);
			temp.displayDetails();
			}
		}
		System.out.println("Using Enhanced For loop");
		for(Apple a : applesArray) {
			if (a != null)
				a.displayDetails();
		}
		
	}
	
}
