package com.xworkz.collections.QueueAndJGArray;
import java.util.PriorityQueue;
public class PencilTester {

	public static void main(String[] args) {
		
		Pencil p1 = new Pencil("Fabel-Castel", "Hexagon", 6);
		Pencil p2 = new Pencil("Apsara", "Hexahon", 10);
		Pencil p3 = new Pencil("Camlin", "Hexagon", 12);
		Pencil p4 = new Pencil("Doms", "Triangular", 8);
		
		PriorityQueue<Pencil> pqPencil = new PriorityQueue<Pencil>(4, new PencilComparator());
		pqPencil.add(p1);
		pqPencil.add(p2);
		pqPencil.add(p3);
		
		System.out.println(pqPencil);
		
		for (Pencil pencil : pqPencil) {
			System.out.println(pencil);
		}
		
		System.out.println("First element : " + pqPencil.peek() );
		System.out.println("Remove element : " + pqPencil.poll());
		pqPencil.element();
		System.out.println("After element-method : " + pqPencil);
		System.out.println("Using offer-Method : " + pqPencil.offer(p4));
		System.out.println(pqPencil);
		
		while (!pqPencil.isEmpty()) {
			System.out.println(pqPencil.poll().getBrand());
		}
	}

}

/* Output : [Pencil [brand=Camlin, shape=Hexagon, noOfPencilsInBox=12], Pencil [brand=Fabel-Castel, shape=Hexagon, noOfPencilsInBox=6], Pencil [brand=Apsara, shape=Hexahon, noOfPencilsInBox=10]]
Pencil [brand=Camlin, shape=Hexagon, noOfPencilsInBox=12]
Pencil [brand=Fabel-Castel, shape=Hexagon, noOfPencilsInBox=6]
Pencil [brand=Apsara, shape=Hexahon, noOfPencilsInBox=10]
First element : Pencil [brand=Camlin, shape=Hexagon, noOfPencilsInBox=12]
Remove element : Pencil [brand=Camlin, shape=Hexagon, noOfPencilsInBox=12]
After element-method : [Pencil [brand=Apsara, shape=Hexahon, noOfPencilsInBox=10], Pencil [brand=Fabel-Castel, shape=Hexagon, noOfPencilsInBox=6]]
Using offer-Method : true
[Pencil [brand=Apsara, shape=Hexahon, noOfPencilsInBox=10], Pencil [brand=Fabel-Castel, shape=Hexagon, noOfPencilsInBox=6], Pencil [brand=Doms, shape=Triangular, noOfPencilsInBox=8]]
Apsara
Doms
Fabel-Castel
*/