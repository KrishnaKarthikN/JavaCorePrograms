package com.xworkz.exceptionHandling.customexception;

import java.util.Scanner;

public class FactorialOfNum {
	public static void main(String[] args) throws InputCannotBeZeroException {
		System.out.println("Enter number to Find Factorial");	
		Scanner input = new Scanner(System.in);
		String str = input.next();
		int num = Integer.parseInt(str);
		if(num==0) {
			throw new InputCannotBeZeroException();
		}
		else {
			int fac = 1 ; 
			for (int i = fac ; i<= num ; i++) { 
				fac *= i;                     		
			}								
			System.out.println("Factorial of number " + num + " is " + fac);
		}
	}
}
