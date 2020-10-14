package com.xworkz.LoopingConcept;

public class Armstrong {
	public static void main(String[] args) {
		int num = 370;
		int sum, rem, temp;
		temp = num; 
		sum = 0;
		while(num>0){
			rem = num % 10;
			sum = sum + (rem * rem * rem);
			num = num / 10;
		}
		if(temp == sum)
			System.out.println(temp + " is Armstrong number ");
		else
			System.out.println(temp + " is not an Armstrong number");
	}
	
}
