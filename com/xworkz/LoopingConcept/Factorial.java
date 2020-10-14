package com.xworkz.LoopingConcept;

public class Factorial {
	public static void main(String[] args) {
		int i , num , fac ;
		fac = 1 ; num = 5; 
		for (i = fac ; i<= num ; i++) { 
			fac *= i;                     		
		}								
		System.out.println("Factorial of number " + num + " is " + fac);
	}
}


//1st iteration : i=1;1<=5;i++  fac = 1*1 = 1
//2st iteration : i=2;2<=5;i++  fac = 1*2 = 2
//3rd iteration : i=3;3<=5;i++  fac = 2*3 = 6
//4th iteration : i=4;4<=5;i++  fac = 6*4 = 24
//5th iteration : i=5;5<=5;i++  fac = 24*5 = 120
