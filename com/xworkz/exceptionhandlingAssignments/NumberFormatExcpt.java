package com.xworkz.exceptionhandlingAssignments;

public class NumberFormatExcpt {
	
	public static void main(String args[])
	   {
		//int num=Integer.parseInt ("XYZ") ;   Gives Number Format Exception 
	 	//System.out.println(num);
		
	    try{
		int num=Integer.parseInt ("XYZ") ;
		System.out.println(num);
	    }
	    catch(NumberFormatException e){
		System.out.println("Number format exception occurred");
	    }
	   }
}
