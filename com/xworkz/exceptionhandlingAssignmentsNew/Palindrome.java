package com.xworkz.exceptionhandlingAssignmentsNew;

public class Palindrome {

	public void palindrome(int Innum)
	{  
		int num = Innum;
		if(num != 0) {
		int rem,sum=0,temp;    
			temp=num;    
			while(num>0){    
				rem=num%10;  
				sum=(sum*10)+rem;    
				num=num/10;    
			}  
		  if(temp==sum)    
		   System.out.println(temp + " palindrome ");    
		  else    
		   System.out.println(temp + " not palindrome");    
		}
		else {
			ArithmeticException ae = new ArithmeticException();
			throw ae;
		}
	}
		  
	
	public static void main(String[] args) {
		
		Palindrome palindrome = new Palindrome();
		palindrome.palindrome(123);
		
	}
	
	
	
}
