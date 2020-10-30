package com.xworkz.StringConcept.Assignments30oct;

public class PrintEvenWords {

	public static void main(String[] args) {
		
		String str = "Welcome to xworkz and you are learning string methods in java";
		printWords(str);
	}

	public static void printWords(String str) {
		for(String word : str.split(" "))
			if(word.length() % 2 ==0)
				System.out.println("Words with even characters : "+ word);
	}
	
	
}

/* Output : Words with even characters : to
Words with even characters : xworkz
Words with even characters : learning
Words with even characters : string
Words with even characters : in
Words with even characters : java
*/
