package com.xworkz.collections.QueueAndJGArray;

import java.util.PriorityQueue;
public class PriorityQString {

	public static void main(String[] args) {
		
		PriorityQueue<String> q = new PriorityQueue<String>();
		q.add("Monday");
		q.add("Tuesday");
		q.add("Wednesday");
		q.add("Thursday");
		q.add("Friday");
		q.add("Saturday");
		System.out.println(q);
		
		for (String pqStr : q) {
			System.out.println(pqStr);
		}
		
		System.out.println("First element : " + q.peek() );
		System.out.println("Remove element : " + q.poll());
		q.element();
		System.out.println("After element-method : " + q);
		System.out.println("Using offer-Method : " + q.offer("Sunday"));
		System.out.println(q);
	}

}

/* Output : [Friday, Monday, Saturday, Tuesday, Thursday, Wednesday]
Friday
Monday
Saturday
Tuesday
Thursday
Wednesday
First element : Friday
Remove element : Friday
After element-method : [Monday, Thursday, Saturday, Tuesday, Wednesday]
Using offer-Method : true
[Monday, Thursday, Saturday, Tuesday, Wednesday, Sunday]
*/
