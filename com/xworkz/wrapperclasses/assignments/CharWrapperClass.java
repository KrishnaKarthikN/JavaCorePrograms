package com.xworkz.wrapperclasses.assignments;

public class CharWrapperClass {

	public static void main(String[] args) {
	System.out.println("Using Wrapping");
	char a = 'A';
	Character c = new Character(a);//Boxing //Wrapping
	System.out.println("The Character @ c is : " + c);
	System.out.println();
	System.out.println("Using AutoBoxing");
	Character chr = a;
	System.out.println("The Character @ chr is : " + chr);
	System.out.println();
	System.out.println("Using UnWrapping");
	char b = Character.valueOf(c);
	System.out.println("The Character @ b is : " + b );
	System.out.println();
	System.out.println("Using Autounboxing");
	char k = c ;
	System.out.println("The Character @ k is : " + k );
	}
}
 