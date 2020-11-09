package com.xworkz.collections.Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class TelevisionTester {

	public static void main(String[] args) {
		
		Television tv1 = new Television("Sony", 55, 82000, "LED");
		Television tv2 = new Television("LG", 32, 14900, "LED");
		Television tv3 = new Television("Samsung", 40, 27500, "FHD");
		Television tv4 = new Television("MI", 50, 31900, "HDR");
		
		ArrayList<Television> tvAL = new ArrayList<Television>();
		tvAL.add(tv1);
		tvAL.add(tv2);
		tvAL.add(tv3);
		tvAL.add(tv4);
		
		System.out.println("Array List");
		System.out.println(tvAL);
		
		for (Television tv : tvAL) {
			System.out.println(tv);
		}
		System.out.println("Sorting by Inches");
		Collections.sort(tvAL, new SortTVByInches());
		System.out.println(tvAL);
		System.out.println("Sorting by Brand in Decreasing Order");
		Collections.sort(tvAL, new SortTVByBrand());
		Collections.reverse(tvAL);
		System.out.println(tvAL);
		System.out.println("Sorting by Type in Decreasing order");
		Collections.sort(tvAL, new SortTVByType());
		Collections.reverse(tvAL);
		System.out.println(tvAL);
		
		
		
	}
	
	
}
/*output: Array List
[Television [brand=Sony, inches=55, price=82000.0, type=LED], Television [brand=LG, inches=32, price=14900.0, type=LED], Television [brand=Samsung, inches=40, price=27500.0, type=FHD], Television [brand=MI, inches=50, price=31900.0, type=HDR]]
Television [brand=Sony, inches=55, price=82000.0, type=LED]
Television [brand=LG, inches=32, price=14900.0, type=LED]
Television [brand=Samsung, inches=40, price=27500.0, type=FHD]
Television [brand=MI, inches=50, price=31900.0, type=HDR]
Sorting by Inches
[Television [brand=LG, inches=32, price=14900.0, type=LED], Television [brand=Samsung, inches=40, price=27500.0, type=FHD], Television [brand=MI, inches=50, price=31900.0, type=HDR], Television [brand=Sony, inches=55, price=82000.0, type=LED]]
Sorting by Brand in Decreasing Order
[Television [brand=Sony, inches=55, price=82000.0, type=LED], Television [brand=Samsung, inches=40, price=27500.0, type=FHD], Television [brand=MI, inches=50, price=31900.0, type=HDR], Television [brand=LG, inches=32, price=14900.0, type=LED]]
Sorting by Type in Decreasing order
[Television [brand=LG, inches=32, price=14900.0, type=LED], Television [brand=Sony, inches=55, price=82000.0, type=LED], Television [brand=MI, inches=50, price=31900.0, type=HDR], Television [brand=Samsung, inches=40, price=27500.0, type=FHD]]
*/
