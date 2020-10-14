package com.xworkz.exceptionhandlingAssignmentsNew;

public class TryWOCatch {
	 public static void main(String args[]){
		 {
			  System.out.println(print());
			 }
	 }	 
			 public static String print() {
			  try
			  {
			   System.out.println("Executing try block"); 
			   return "Return from try block";
			  }
			  finally
			  {
			   System.out.println("Executing finally block"); 
			  }
		 }
}