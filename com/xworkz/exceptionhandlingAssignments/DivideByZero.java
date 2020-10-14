package com.xworkz.exceptionhandlingAssignments;

public class DivideByZero {

	public static void main(String[] args) {
		
		int a = 10, b = 0;
		int res = 0;
		try {
		res = a / b;//Arithmetic Exception ==> Try catch Block
		System.out.println(res);
		}catch(ArithmeticException e) {
			System.out.println("Entered Zero Divisor");
		}
	}
}
