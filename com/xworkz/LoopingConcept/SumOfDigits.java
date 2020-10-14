package com.xworkz.LoopingConcept;

public class SumOfDigits {
	public static void main(String[] args) {
		int num = 123  , sum = 0 , a;
		int temp = num;
		 while(temp!=0)
		    {
			a = temp % 10; 
			sum += a;
			temp /= 10;
		    }
		    System.out.println("Sum of digits of a number is "+sum);
	}
}
