package com.xworkz.arrays.assignment;

public class FloatArray {
	public static void main(String[] args) {
		float[] arr = new float[5];
		arr[0] = 5.1f;
		arr[1] = 5.2f;
		arr[2] = 5.3f;
		arr[3] = 5.4f;
		arr[4] = 5.5f;
		System.out.println("For Loop");
		for (int i = 0 ; i<=arr.length-1 ; i++ ) {
			float temp = arr[i];
			System.out.println(" Float " + i + " is " + temp);  // for loop
		}
		System.out.println("For Each loop / Enhanced For Loop");
		//For Each Loop
		for (float ar : arr ) {
			System.out.println(" Float value is : " + ar);
		}
	}
	
}
