package com.xworkz.StringConcept.Assignments30oct;

public class UppercaseToEnd {

	public static String upperEnd(String str) {
		int length = str.length();
		String a="";//a be  characters
		String b = "";//b be upper characters
		for (int i=0;i<length;i++) {
			char c = str.charAt(i);
			if(c >= 'A' && c <= 'Z') {
				a += c;
			}
			else
				b += c;
				
		}
		return b + " " + a;
				
	}
	public static void main(String[] args) {
		
		String str = "How Are You Folks?";
		System.out.println("Entered String is : " + str);
		System.out.println("UpperCase characters at the end of the string : "+ upperEnd(str));
		
	}

}
/*output: Entered String is : How Are You Folks?
UpperCase characters at the end of the string : ow re ou olks? HAYF
 */

