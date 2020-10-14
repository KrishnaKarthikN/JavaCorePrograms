package com.xworkz.exceptionhandlingAssignmentsNew;

public class ExceptionPropagation {
	public static void main(String[] args) {
		System.out.println("Example of Exception Propagation");
		ExceptionPropagation ep = new ExceptionPropagation();
		ep.method1();
				
	}
	
	void method1() {
		System.out.println("Start of Method 1");
		try {
			method2();
		}catch(ArithmeticException e) {
			System.out.println("End of Method 1");
		}
	}
	void method2() {
		System.out.println("Start of Method 2");
		int res= 100/0;
		System.out.println("The value of res is : "+ res);
		System.out.println("End of Method 2");
		
	}
	
	
}
