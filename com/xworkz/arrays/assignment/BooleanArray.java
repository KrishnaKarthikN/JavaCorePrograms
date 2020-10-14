package com.xworkz.arrays.assignment;

public class BooleanArray {
	
	public static void main(String[] args) {
		boolean[] arr = new boolean[5];
		arr[0] = true;
		arr[1] = false;
		arr[2] = true;
		arr[3] = false;
		arr[4] = true;
		System.out.println("For Loop");
		for (int i = 0 ; i<=arr.length-1 ; i++ ) {
			boolean temp = arr[i];
			System.out.println(" boolean " + i + " is " + temp);  // for loop
		}
		System.out.println("For Each loop / Enhanced For Loop");
		//For Each Loop
		for (boolean ar : arr ) {
			System.out.println(" Boolean value is : " + ar);
		}
	}
}	
