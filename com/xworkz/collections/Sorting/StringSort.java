package com.xworkz.collections.Sorting;

import java.util.ArrayList;
import java.util.Collections;


public class StringSort {

	public static void main(String[] args) {
		
		ArrayList<String> weekDays = new ArrayList<String>();
		weekDays.add("Monday");
		weekDays.add("Tuesday");
		weekDays.add("Wednesday");
		weekDays.add(3,"Thursday");
		System.out.println("Entered Array values");
		System.out.println(weekDays);
		System.out.println("After Ascending Sorting");
		Collections.sort(weekDays);
		System.out.println(weekDays);
		System.out.println("After Descending Sorting");
		Collections.reverse(weekDays);
		System.out.println(weekDays);
	}
	
	
	
}
/*output :  Entered Array values
[0.55, 1.55, 8.55, 6.55, 4.55, 7.55, 2.55, 9.55, 5.55, 3.55]
After Ascending Sorting
[0.55, 1.55, 2.55, 3.55, 4.55, 5.55, 6.55, 7.55, 8.55, 9.55]
After Descending Sorting
[9.55, 8.55, 7.55, 6.55, 5.55, 4.55, 3.55, 2.55, 1.55, 0.55]

 * */
