package com.xworkz.exceptionhandlingAssignments;

public class NullPointException {
	
	public static void main(String args[]){
				
		
		try{
			String str=null;
			System.out.println (str.length());
		}
	        catch(NullPointerException e){
			System.out.println("NullPointerException..");
		}
	}
}
