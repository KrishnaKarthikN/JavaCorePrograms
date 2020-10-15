package com.xworkz.wrapperclasses.assignments;

public class DoubleWrapperClass {
	public static void main(String[] args) {
	System.out.println("Using Wrapping");
	double a = 22.25;
	Double c = new Double(a);//Boxing //Wrapping
	System.out.println("The Value of Character c is : " + c);
	System.out.println();
	System.out.println("Using AutoBoxing");
	Double x = a;
	System.out.println("The Value of Character chr is : " + a);
	System.out.println();
	System.out.println("Using UnWrapping");
	double b = Double.valueOf(c);
	System.out.println("The value of b is : " + b );
	System.out.println();
	System.out.println("Using Autounboxing");
	double k = c ;
	System.out.println("The value of k is : " + k );
	}
}
