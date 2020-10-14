package com.xworkz.arrays.assignment;

public class DuplicateElement {
  
	 public static void main(String[] args) 
	    {
	        int arr[]={1,2,1,2,3,4,5,1,2};
	        System.out.println("Elements Array");
	        for (int i=0;i<arr.length; i++ )
	        {
	            System.out.print(arr[i] + " ");
	        }
	        
	        for(int i=0;i<arr.length;i++)
	        {
	            for(int j=i;j<arr.length;j++)
	            {
	                if(arr[i]>arr[j])
	                {
	                    int temp=arr[i];
	                    arr[i]=arr[j];
	                    arr[j]=temp;
	                }
	            }
	        }
	        System.out.println();
	        System.out.println("Sorting Elements");
	        for(int i=0;i<arr.length;i++)
	        {
	            System.out.print(arr[i]+" ");
	        }
	        System.out.println();
	        System.out.println("After Removing Duplicates");
	        int a=0;
	        arr[a]=arr[0];
	        for(int i=0;i<arr.length;i++)
	        {
	            if (arr[a]!=arr[i])
	            {
	                a++;
	                arr[a]=arr[i];
	            }
	        }
	        for (int i=0;i<=a;i++ )
	        {
	            System.out.print(arr[i]+" ");
	        }
	    }
	}
