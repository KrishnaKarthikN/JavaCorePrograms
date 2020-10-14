package com.xworkz.LoopingConcept;

public class Count {
	public static void main(String[] args) {
        int count = 0, num = 456;
        do{
            num /= 10;
            count++;
        }while(num != 0);
        System.out.println("The Number of Digits in Given Number is " + count);

	}
}
