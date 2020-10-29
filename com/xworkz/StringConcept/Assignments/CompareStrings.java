package com.xworkz.StringConcept.Assignments;

public class CompareStrings {

	public static void main(String[] args) {
		System.out.println("Type I");
		String str1 = "Krishna";
		String str2 = "Krishna";//Refers to same location and value
		
		boolean res = str1.equals(str2);
		System.out.println("result of str1.equals(str2) : " + res);
		System.out.println();
		System.out.println("Type II"); 
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		String s3 = new String("hello"); //Compares values
		System.out.println("Result of s1.equals(s2) : " +s1.equals(s2));
		System.out.println("Result of s1.equals(s3) : " +s1.equals(s3));
		System.out.println();
		System.out.println("Type III");//Considers Memory Location
		System.out.println("is (s1==s2) : " + (s1==s2));
		System.out.println();
		System.out.println("Type IV");
		String n = "A";
		String m = "B";
		System.out.println("Comparing m and n : " + m.compareTo(n));
		System.out.println();
		System.out.println("Type V");
		String a = "Krishna";
		String b = "Karthik";
		System.out.println("Characters are equal : " + (a.charAt(0)==b.charAt(0)) );
		System.out.println("Characters are equal : " + (a.charAt(1)==b.charAt(1)) );
	}
}
/*Output:  Type I
result of str1.equals(str2) : true

Type II
Result of s1.equals(s2) : true
Result of s1.equals(s3) : false

Type III
is (s1==s2) : false

Type IV
Comparing m and n : 1

Type V
Characters are equal : true
Characters are equal : false

      */
