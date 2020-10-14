package com.xworkz.arrays.assignment;

public class LAndSNumbers {
	
	public static void main(String args[])
	{
	int l,s;
	int arr[] = {21,3,52,43,86,39,70};
	int n = arr.length;

    for(int i=0;i<n;i++)
    {
        for(int j=i;j<n;j++)
        {
            if(arr[i]>arr[j])
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    for(int i = 0; i<n;i++) {
    	System.out.print(arr[i]+ " ");
    }
	l=s=arr[0];
	for(int k=1;k<n;k++){
		if(arr[k]>l)
			l=arr[k];
		if(arr[k]<s)
			s=arr[k];
	}
	System.out.println("The largest element is " + l );
	System.out.println("The smallest element is " + s );
	
	}
	
}
