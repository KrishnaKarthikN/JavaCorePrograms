package com.xworkz.LoopingConcept;

public class PrimeNumbers {

	public static void main(String[] args) {
		int  num1 = 7 ;
		int a = 1;
		for ( int i = 2 ; i <= num1/2 ; i++ ) {
			if(num1 % i == 0 ) {
				a = 0;
			break;
			}
		}
		if (a==1)
			System.out.println(num1 + " Number is prime");
		else 
			System.out.println(num1 + " number is not prime");
		
		int  num2 = 9 ;
		int b = 1;
		for ( int i = 2 ; i <= num2/2 ; i++ ) {
			if(num2 % i == 0 ) {
				b = 0;
			break;
			}
		}
		if (b==1)
			System.out.println(num2 + " Number is prime");
		else 
			System.out.println(num2 + " number is not prime");
	
	}
	
	
}
