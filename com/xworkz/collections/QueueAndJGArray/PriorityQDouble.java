package com.xworkz.collections.QueueAndJGArray;

import java.util.PriorityQueue;

public class PriorityQDouble {

public static void main(String[] args) {
		
		PriorityQueue<Double> qD = new PriorityQueue<Double>();
		qD.add(0.55);
		qD.add(7.55);
		qD.add(6.55);
		qD.add(3.55);
		qD.add(4.55);
		qD.add(1.55);
		qD.add(2.55);
		qD.add(5.55);
		System.out.println(qD);
		
		for (Double pqD : qD) {
			System.out.println(pqD);
		}
		
		System.out.println("First element : " + qD.peek() );
		System.out.println("Remove element : " + qD.poll());
		qD.element();
		System.out.println("After element-method : " + qD);
		System.out.println("Using offer-Method : " + qD.offer(8.50));
		System.out.println(qD);
	}

}

/* Output : [0.55, 3.55, 1.55, 5.55, 4.55, 6.55, 2.55, 7.55]
0.55
3.55
1.55
5.55
4.55
6.55
2.55
7.55
First element : 0.55
Remove element : 0.55
After element-method : [1.55, 3.55, 2.55, 5.55, 4.55, 6.55, 7.55]
Using offer-Method : true
[1.55, 3.55, 2.55, 5.55, 4.55, 6.55, 7.55, 8.5]
*/