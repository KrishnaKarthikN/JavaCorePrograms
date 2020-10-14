package com.xworkz.staticmembers.Assignments;

public class Pi {

	static float pi;
	static void piInit() {
		pi = 22/7;
		System.out.println("The value of pi :" + pi);
	}
	static void add()
	{
		int a = 15;
		float sum = a + pi ;
		System.out.println("The value of sum :" + sum);
	}	
	static void mul() {
		int a = 15;
		float res = a * pi;
		System.out.println("The value of res :" + res);
	}
	
	
}
