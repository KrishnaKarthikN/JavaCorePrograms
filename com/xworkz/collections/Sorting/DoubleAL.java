package com.xworkz.collections.Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class DoubleAL {
 
	public static void main(String[] args) {
		
		ArrayList<Double> dnums = new ArrayList<Double>();
		dnums.add(0.55);
		dnums.add(1.55);
		dnums.add(8.55);
		dnums.add(6.55);
		dnums.add(4.55);
		dnums.add(7.55);
		dnums.add(2.55);
		dnums.add(9.55);
		dnums.add(5.55);
		dnums.add(3.55);
		System.out.println("Entered Array values");
		System.out.println(dnums);
		System.out.println("After Ascending Sorting");
		Collections.sort(dnums);
		System.out.println(dnums);
		System.out.println("After Descending Sorting");
		Collections.reverse(dnums);
		System.out.println(dnums);
		
		
	}
	
}
/*output: Entered Array values
[0.55, 1.55, 8.55, 6.55, 4.55, 7.55, 2.55, 9.55, 5.55, 3.55]
After Ascending Sorting
[0.55, 1.55, 2.55, 3.55, 4.55, 5.55, 6.55, 7.55, 8.55, 9.55]
After Descending Sorting
[9.55, 8.55, 7.55, 6.55, 5.55, 4.55, 3.55, 2.55, 1.55, 0.55]
*/
