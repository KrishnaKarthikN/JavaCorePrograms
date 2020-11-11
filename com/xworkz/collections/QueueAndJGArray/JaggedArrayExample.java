
package com.xworkz.collections.QueueAndJGArray;

public class JaggedArrayExample {

		    public static void main(String[] args) { 
	        
	        int arr[][] = new int[5][]; 
	        arr[0] = new int[3];
	        arr[1] = new int[2];
	        arr[2] = new int[1];
	        arr[3] = new int[2];
	        arr[4] = new int[3];
	        int count = 0; 
	        for (int i=0; i<arr.length; i++) 
	            for(int j=0; j<arr[i].length; j++) 
	                arr[i][j] = count++; 
	        System.out.println("Jagged Array 2Dimensional"); 
	        for (int i=0; i<arr.length; i++) 
	        { 
	            for (int j=0; j<arr[i].length; j++) 
	                System.out.print(arr[i][j] + " "); 
	            System.out.println(); 
	        } 
	    } 
}
	
/* output :
 * Jagged Array 2Dimensional
0 1 2 
3 4 
5 
6 7 
8 9 10 
	
 */
	
