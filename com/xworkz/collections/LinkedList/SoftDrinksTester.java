package com.xworkz.collections.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class SoftDrinksTester {

	public static void main(String[] args) {
		
		SoftDrinks sd1 = new SoftDrinks("Sprite", 1.75, 75);
		SoftDrinks sd2 = new SoftDrinks("Coco-Cola", 1.75, 76);
		SoftDrinks sd3 = new SoftDrinks("Pepsi", 2.25, 74);
		SoftDrinks sd4 = new SoftDrinks("Mirinda", 2.25, 73);
		SoftDrinks sd5 = new SoftDrinks("Fanta", 2.25, 84);
		
		LinkedList<SoftDrinks> softDrinksLL = new LinkedList<SoftDrinks>();
		softDrinksLL.add(sd1);
		softDrinksLL.add(1, sd2);
		softDrinksLL.addFirst(sd3);
		softDrinksLL.addLast(sd4);
		softDrinksLL.add(sd5);
		System.out.println(softDrinksLL);
		System.out.println("-----------------------------------------------");
		System.out.println("Using ForEach Loop ");
		for(SoftDrinks sd : softDrinksLL)
			System.out.println(sd);
		System.out.println("-----------------------------------------------");
		System.out.println("Using Iterator ");
		Iterator<SoftDrinks> sditr = softDrinksLL.iterator();
		while(sditr.hasNext()) {
			System.out.println(sditr.next());
		}
		System.out.println("-----------------------------------------------");
		System.out.println("Using List Iterator ");
		System.out.println("Forward List Iterator ");
		ListIterator<SoftDrinks> sdlitr = softDrinksLL.listIterator();
		while(sdlitr.hasNext()) {
			System.out.println(sdlitr.next());
		}
		System.out.println("Backward List Iterator ");
		while(sdlitr.hasPrevious()) {
			System.out.println(sdlitr.previous());
		}
		System.out.println("-----------------------------------------------");
		System.out.println("Removal Methods ");
		softDrinksLL.remove();
		System.out.println(softDrinksLL);
		softDrinksLL.poll();
		System.out.println(softDrinksLL);
		softDrinksLL.pollFirst();
		System.out.println(softDrinksLL);
		softDrinksLL.pollLast();
		System.out.println(softDrinksLL);
		softDrinksLL.removeAll(softDrinksLL);
		System.out.println(softDrinksLL);
		System.out.println("Using push method : ");
		softDrinksLL.push(sd5);
		System.out.println(softDrinksLL);
		System.out.println("Using pop method : ");
		softDrinksLL.pop();
		System.out.println(softDrinksLL);
		
		
		}

}

/* output : 
 [SoftDrinks [company=Pepsi, quantity=2.25, price=74], SoftDrinks [company=Sprite, quantity=1.75, price=75], SoftDrinks [company=Coco-Cola, quantity=1.75, price=76], SoftDrinks [company=Mirinda, quantity=2.25, price=73], SoftDrinks [company=Fanta, quantity=2.25, price=84]]
-----------------------------------------------
Using ForEach Loop 
SoftDrinks [company=Pepsi, quantity=2.25, price=74]
SoftDrinks [company=Sprite, quantity=1.75, price=75]
SoftDrinks [company=Coco-Cola, quantity=1.75, price=76]
SoftDrinks [company=Mirinda, quantity=2.25, price=73]
SoftDrinks [company=Fanta, quantity=2.25, price=84]
-----------------------------------------------
Using Iterator 
SoftDrinks [company=Pepsi, quantity=2.25, price=74]
SoftDrinks [company=Sprite, quantity=1.75, price=75]
SoftDrinks [company=Coco-Cola, quantity=1.75, price=76]
SoftDrinks [company=Mirinda, quantity=2.25, price=73]
SoftDrinks [company=Fanta, quantity=2.25, price=84]
-----------------------------------------------
Using List Iterator 
Forward List Iterator 
SoftDrinks [company=Pepsi, quantity=2.25, price=74]
SoftDrinks [company=Sprite, quantity=1.75, price=75]
SoftDrinks [company=Coco-Cola, quantity=1.75, price=76]
SoftDrinks [company=Mirinda, quantity=2.25, price=73]
SoftDrinks [company=Fanta, quantity=2.25, price=84]
Backward List Iterator 
SoftDrinks [company=Fanta, quantity=2.25, price=84]
SoftDrinks [company=Mirinda, quantity=2.25, price=73]
SoftDrinks [company=Coco-Cola, quantity=1.75, price=76]
SoftDrinks [company=Sprite, quantity=1.75, price=75]
SoftDrinks [company=Pepsi, quantity=2.25, price=74]
-----------------------------------------------
Removal Methods 
[SoftDrinks [company=Sprite, quantity=1.75, price=75], SoftDrinks [company=Coco-Cola, quantity=1.75, price=76], SoftDrinks [company=Mirinda, quantity=2.25, price=73], SoftDrinks [company=Fanta, quantity=2.25, price=84]]
[SoftDrinks [company=Coco-Cola, quantity=1.75, price=76], SoftDrinks [company=Mirinda, quantity=2.25, price=73], SoftDrinks [company=Fanta, quantity=2.25, price=84]]
[SoftDrinks [company=Mirinda, quantity=2.25, price=73], SoftDrinks [company=Fanta, quantity=2.25, price=84]]
[SoftDrinks [company=Mirinda, quantity=2.25, price=73]]
[]
Using push method : 
[SoftDrinks [company=Fanta, quantity=2.25, price=84]]
Using pop method : 
[]
 
*/