package com.xworkz.StringConcept.Assignments;

public class SwapLettersString {
	
	public static void main(String[] args) {
		String str = "Hello Folks";
		System.out.println("String before swapping : " + str);
		System.out.println("String after swapping  : "  + swap(str));
		
	}
	public static String swap (String str) {
		
		char[] c = str.toCharArray();
		char temp = c[0];
		c[0] = c[c.length-1];
		c[c.length-1] = temp;
		
		return String.valueOf(c);
		
	}
}
/* Output:String before swapping : Hello Folks
String after swapping  : sello FolkH
*/