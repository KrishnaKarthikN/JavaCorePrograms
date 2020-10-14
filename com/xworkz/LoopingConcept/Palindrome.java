package com.xworkz.LoopingConcept;

public class Palindrome {
	 public static void main(String args[]){  
		  int rem,sum=0,temp;    
		  int num=12321;  
		  
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
		
//		  int rem1,sum1=0,temp1;    
//		  int num1=12345;  
//		  
//		  temp1=num1;    
//		  while(num1>0){    
//		   rem1=num1%10;  
//		   sum1=(sum1*10)+rem1;    
//		   num1=num1/10;    
//		  }    
//		  if(temp1==sum1)    
//		   System.out.println(temp1 + " palindrome ");    
//		  else    
//		   System.out.println(temp1 + " not palindrome");  
	 
	 
	 }
}
