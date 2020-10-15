package com.xworkz.TypeCasting.assignments;

public class ChOutput {
public static void main(String[] args) {
	char ch = 'A';
	int a = (int)ch + 26 ;
	ch = (char) a;
	System.out.println("The Character value @ ch: " + ch);
	
}
}
