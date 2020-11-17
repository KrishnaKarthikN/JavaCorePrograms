package com.xworkz.collections.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Monday");
		ts.add("Tuesday");
		ts.add("Wednesday");
		ts.add("Thursday");
		ts.add("Friday");
		ts.add("Saturday");
		ts.add("Sunday");
		System.out.println("Printing TreeSet");
		System.out.println(ts);
		System.out.println("====================================================");
		System.out.println("Using foreach loop");
		for (String str : ts) {
			System.out.println(str);			
		}
		System.out.println("====================================================");
		System.out.println("Using Iterator");
		Iterator<String> itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
	}

}
