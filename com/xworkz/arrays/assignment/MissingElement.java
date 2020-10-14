package com.xworkz.arrays.assignment;

public class MissingElement {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,7,8,9,10};
		System.out.println("The Missing number between 1 to 10: " + MissingNumber(arr));
		
		
	}
	public static int MissingNumber(int[] arr) {
	int m = arr.length+1;
	int total = m*(m+1)/2;
	//System.out.println(total);
	int sum = 0;
	for(int i=0;i<arr.length;i++)
		sum = sum+arr[i];
	//System.out.println(sum);
	return total - sum;
	}

}
