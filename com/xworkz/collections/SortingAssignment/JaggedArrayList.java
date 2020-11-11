package com.xworkz.collections.SortingAssignment;
import java.util.ArrayList;
import java.util.List;
public class JaggedArrayList {

	 private static void jaggedArrayList() {
		    int array = 3;
		    List<List<Integer>> arr = new ArrayList<>();
		    for (int i = 0; i < array; i++)
		      arr.add(new ArrayList<Integer>());
		    int count = 0;
		    for (int i = 0; i < array; i++)
		      for (int j = 0; j <= i; j++)
		        arr.get(i).add(count++);
		    System.out.println("Jagged ArrayList");
		    for (List<Integer> list : arr) {
		      for (Integer i : list)
		        System.out.print(i + " ");
		      System.out.println();
		    }
		  }

		  public static void main(String[] args) {
		    jaggedArrayList();
		   }
		
	
	
	
	
}
