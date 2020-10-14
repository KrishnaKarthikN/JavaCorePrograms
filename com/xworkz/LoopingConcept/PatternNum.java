package com.xworkz.LoopingConcept;

public class PatternNum {
	public static void main(String[] args) {
		int i , j , n;
		n = 5;
		for(i = n ; i >0 ; i--) {
			for(j = n; j >= i ; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
