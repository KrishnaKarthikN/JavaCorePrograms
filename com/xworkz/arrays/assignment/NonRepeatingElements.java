package com.xworkz.arrays.assignment;
import java.util.*;
public class NonRepeatingElements {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a = new int[10];
        System.out.print("enter size of an array");
        int b=sc.nextInt();
        System.out.print("enter elements of an array");
        for(int i=0;i<b;i++)
        {
             a[i]=sc.nextInt();
        }
        
        NonRepeating(a,b);
     }
	public static void NonRepeating(int a[],int n)
	      {
	          int count;
	          System.out.println("Non Repeating element in array");
	         for(int i=0;i<n;i++)
	         {
	             count=0;
             for (int j = 0; j < n; j++)
	             {
	                if(a[i]==a[j] && i!=j)
	                       count++;
	             }
	          if(count==0)
	              System.out.print(a[i]+" ");
	         }
	       }

}





	

