package com.xworkz.LoopingConcept;

public class Skip5 {
	public static void main(String[] args) {
		int i = 0;
		while(i<=10) {
			if(i==5) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
		System.out.println();
	for (int j = 0; j<=10 ; j++) {
		if (j>5)
			break;
		System.out.println(j);
	}
	
	
	
	
	
	}
}
