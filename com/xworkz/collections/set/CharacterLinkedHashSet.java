package com.xworkz.collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class CharacterLinkedHashSet {

	public static void main(String[] args) {
		
		LinkedHashSet<Character> chr = new LinkedHashSet<Character>();
		chr.add('a');
		chr.add('b');
		chr.add('c');
		chr.add('d');
		chr.add('e');
		System.out.println("Printing LinkedHashset");
		System.out.println(chr);
		System.out.println("====================================================");
		System.out.println("Using foreach loop");
		for (Character chrs : chr) {
			System.out.println(chrs);			
		}
		System.out.println("====================================================");
		System.out.println("Using Iterator");
		Iterator<Character> itr = chr.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
