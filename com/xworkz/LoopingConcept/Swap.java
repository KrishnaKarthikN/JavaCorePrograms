package com.xworkz.LoopingConcept;

public class Swap {
	public static void main(String[] args) {
		int num1 = 10 , num2 = 30 ;
		System.out.println("The numbers before swapping num1 " + num1 + " num2 " + num2);
		int temp;
		temp = num1;
		num1 = num2; 
		num2 = temp;
		System.out.println("The numbers after swapping num1 " + num1 + " num2 " + num2);
	}
}
