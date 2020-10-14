package com.xworkz.arrays.assignment;

public class StringArray {
	public static void main(String[] args) {
		String[] cars = new String[5];
		cars[0] = "Benz";
		cars[1] = "Audi";
		cars[2] = "Honda";
		cars[3] = "Hyundai";
		cars[4] = "BMW";
		System.out.println("For Loop");
		for (int i = 0 ; i<=cars.length-1 ; i++ ) {
			String temp = cars[i];
			System.out.println(" String " + i + " is " + temp);  // for loop
		}
		System.out.println("For Each loop / Enhanced For Loop");
		//For Each Loop
		for (String car : cars ) {
			System.out.println(" String value is : " + car);//adding numbers here does not affect the values in the array
		}
	}
}
