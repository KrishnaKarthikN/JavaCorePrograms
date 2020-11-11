package com.xworkz.collections.QueueAndJGArray;


import java.util.Iterator;
import java.util.PriorityQueue;

public class MobileTester {

	public static void main(String[] args) {
	
		Mobile m1 = new Mobile("Apple", 3, "Black", 4);
		Mobile m2 = new Mobile("Samsung", 4, "Blue", 6);
		Mobile m3 = new Mobile("Oppo", 4, "Grey", 4);
		Mobile m4 = new Mobile("MI", 2, "Purple", 3);
		Mobile m5 = new Mobile("Vivo", 2, "White", 4);
		
		PriorityQueue<Mobile> pqMobile = new PriorityQueue<Mobile>();
		pqMobile.add(m1);
		pqMobile.add(m2);
		pqMobile.add(m3);
		pqMobile.add(m4);
		
		System.out.println(pqMobile);
		
		Iterator<Mobile> mobile = pqMobile.iterator();
		while(mobile.hasNext()) {
			System.out.println(mobile.next());
		}
		
		System.out.println("First element : " + pqMobile.peek() );
		System.out.println("Remove element : " + pqMobile.poll());
		pqMobile.element();
		System.out.println("After element-method : " + pqMobile);
		System.out.println("Using offer-Method : " + pqMobile.offer(m5));
		System.out.println(pqMobile);
		
		
		
	}

}

/* Output : [Mobile [brand=MI, noOfCameras=2, color=Purple, ramInGB=3], Mobile [brand=Apple, noOfCameras=3, color=Black, ramInGB=4], Mobile [brand=Oppo, noOfCameras=4, color=Grey, ramInGB=4], Mobile [brand=Samsung, noOfCameras=4, color=Blue, ramInGB=6]]
Mobile [brand=MI, noOfCameras=2, color=Purple, ramInGB=3]
Mobile [brand=Apple, noOfCameras=3, color=Black, ramInGB=4]
Mobile [brand=Oppo, noOfCameras=4, color=Grey, ramInGB=4]
Mobile [brand=Samsung, noOfCameras=4, color=Blue, ramInGB=6]
First element : Mobile [brand=MI, noOfCameras=2, color=Purple, ramInGB=3]
Remove element : Mobile [brand=MI, noOfCameras=2, color=Purple, ramInGB=3]
After element-method : [Mobile [brand=Apple, noOfCameras=3, color=Black, ramInGB=4], Mobile [brand=Samsung, noOfCameras=4, color=Blue, ramInGB=6], Mobile [brand=Oppo, noOfCameras=4, color=Grey, ramInGB=4]]
Using offer-Method : true
[Mobile [brand=Apple, noOfCameras=3, color=Black, ramInGB=4], Mobile [brand=Vivo, noOfCameras=2, color=White, ramInGB=4], Mobile [brand=Oppo, noOfCameras=4, color=Grey, ramInGB=4], Mobile [brand=Samsung, noOfCameras=4, color=Blue, ramInGB=6]]
*/