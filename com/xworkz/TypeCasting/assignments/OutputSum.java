package com.xworkz.TypeCasting.assignments;

public class OutputSum {
	public static void main(String[] args) {
		long l = 30;
		int i = 50;
		short s = 60;
		byte b = 70;
		System.out.println("Type 1");
		int sum = (int) l + (int)i + (int)s + (int)b ;
		System.out.println("Sum = "+ sum);
		System.out.println("Type 2");
		int sum1 = (int)(l + i + s + b);
		System.out.println("Sum = " + sum1);
	}
}
