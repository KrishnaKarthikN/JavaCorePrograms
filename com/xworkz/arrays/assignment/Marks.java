package com.xworkz.arrays.assignment;
import java.util.*;
public class Marks {
	 public static void main(String args[])
	    {
	        int marks[] = new int[6];
	        int i;
	        float total=0, avg;
	        Scanner scanner = new Scanner(System.in);
				        
	        for(i=0; i<5; i++) { 
	           System.out.print("Enter Marks of Subject"+(i+1)+":");
	           marks[i] = scanner.nextInt();
	           total = total + marks[i];
	        }
	        scanner.close();
	        System.out.println("Total Marks : " + total );
	        avg = total/5;
	        System.out.println("Percentage : " + avg );
	        
}
}