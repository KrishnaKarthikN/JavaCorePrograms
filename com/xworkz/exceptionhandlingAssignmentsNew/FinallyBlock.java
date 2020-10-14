package com.xworkz.exceptionhandlingAssignmentsNew;

public class FinallyBlock {
	 public static void main(String args[]){
		 System.out.println("Finally Block Usage");
		 System.out.println();
	      try{
	         System.out.println("First statement of try block");
	         int num=45/0;
	         System.out.println(num);
	      }
	      catch(ArithmeticException e){
	         System.out.println("ArithmeticException Occured");
	         System.out.println("Enter Valid Divisor");
	      }
	      finally{
	    	  System.out.println();
	         System.out.println("finally block");
	      }
	      System.out.println("Out of try-catch-finally block");
	 }
}
