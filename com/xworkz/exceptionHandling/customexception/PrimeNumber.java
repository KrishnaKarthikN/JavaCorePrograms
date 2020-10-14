package com.xworkz.exceptionHandling.customexception;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) throws InputCannotBeZeroException {
	System.out.println("Enter number to check for Prime-0Number");	
	Scanner input = new Scanner(System.in);
	String str = input.next();
	int num = Integer.parseInt(str);
	if(num == 0) {
		throw new InputCannotBeZeroException();
	} 	
	
	else {
	  
		int a = 1;
		for ( int i = 2 ; i <= num/2 ; i++ ) {
			if(num % i == 0 ) {
				a = 0;
			break;
			}
		}
		if (a==1)
			System.out.println(num + " Number is prime");
		else 
			System.out.println(num + " number is not prime");
		
		
		}
	}
}