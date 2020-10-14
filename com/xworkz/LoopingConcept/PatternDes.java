package com.xworkz.LoopingConcept;

public class PatternDes {
	public static void main(String[] args) {
		int i , j , n ;
		n = 5 ; 
		for(i = n ; i >= 0 ; i--) {
			 for(j=2*(n-i); j>=0; j--) 	            
	                System.out.print(" ");  	             
	           for(j=0; j<=i; j++)	                      
	                System.out.print("* "); 
	           System.out.println(); 
	        } 
	    } 
}
	  
