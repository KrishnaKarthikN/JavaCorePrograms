package com.xworkz.LoopingConcept;

public class PascalTriangle {
	public static void main(String[] args) {
		   int num = 5 , c = 1 ;
		    
		    for(int i=0 ; i<=num ; i++)
		    {
		        for(int a = 1 ; a <= num-i ; a++)
		        System.out.print(" ");
		        for(int j = 0 ; j <= i ; j++){
		            if (j == 0||i == 0)
		                c = 1;
		            else
		               c = c * (i-j+1) / j;
		            System.out.print(" "+c);
		        }
		        System.out.print("\n");
		    }
		
	}
}