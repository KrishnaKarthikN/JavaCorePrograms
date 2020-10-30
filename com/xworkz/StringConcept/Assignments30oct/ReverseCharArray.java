package com.xworkz.StringConcept.Assignments30oct;

public class ReverseCharArray {

	public static void main(String[] args) {
		
		String str = "Krishna Karthik";
		char[] ch = str.toCharArray();
		for(int i = ch.length-1 ; i >= 0 ; i-- )
			System.out.print(ch[i]);
 	}
	
}
//Output : kihtraK anhsirK