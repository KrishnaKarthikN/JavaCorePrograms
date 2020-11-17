package com.xworkz.collections.set;

import java.util.HashSet;
import java.util.Iterator;

public class StringHashSet {

	public static void main(String[] args) {
		
		HashSet<String> months = new HashSet<String>();
		months.add("January");
		months.add("February");
		months.add("March");
		months.add("April");
		months.add("May");
		months.add("June");
		months.add("July");
		months.add("August");
		months.add("September");
		months.add("October");
		months.add("November");
		months.add("December");
		System.out.println("Printing Hashset");
		System.out.println(months);
		System.out.println("====================================================");
		System.out.println("Using foreach loop");
		for (String mn : months) {
			System.out.println(mn);			
		}
		System.out.println("====================================================");
		System.out.println("Using Iterator");
		Iterator<String> itr = months.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
		
	}

}
