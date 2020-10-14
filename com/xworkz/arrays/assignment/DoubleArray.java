package com.xworkz.arrays.assignment;

public class DoubleArray {
		public static void main(String[] args) {
		double[] arr = new double[5];
		arr[0] = 0.10;
		arr[1] = 0.20;
		arr[2] = 0.30;
		arr[3] = 0.40;
		arr[4] = 0.50;
		System.out.println("For Loop");
		for (int i = 0 ; i<=arr.length-1 ; i++ ) {
			double temp = arr[i];
			System.out.println(" Double " + i + " is " + temp);  // for loop
		}
		System.out.println("For Each loop / Enhanced For Loop");
		//For Each Loop
		for (double ar : arr ) {
			System.out.println(" Double value is : " + ar);
		}
	}
}
