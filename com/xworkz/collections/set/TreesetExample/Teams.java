package com.xworkz.collections.set.TreesetExample;

import java.util.Iterator;
import java.util.TreeSet;

public class Teams {

	public static void main(String[] args) {
		
		TreeSet<String> teams = new TreeSet<String>();
		teams.add("India");
		teams.add("Australia");
		teams.add("South Africa");
		teams.add("England");
		teams.add("Sri Lanka");
		System.out.println("Printing TreeSet");
		System.out.println(teams);
		System.out.println("====================================================");
		System.out.println("Using Iterator");
		Iterator<String> itr = teams.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("====================================================");
		System.out.println("Executing Methods");
		System.out.println("Using Floor method : " + teams.floor("Bangladesh"));
		System.out.println("Using Ceiling method : " + teams.ceiling("Finland"));
		System.out.println("Using first method : " + teams.first());
		System.out.println("Using last method : " + teams.last());
		System.out.println("Using pollfirst method : " + teams.pollFirst());
		System.out.println("Using polllast method : " + teams.pollLast());
		System.out.println(teams);
		
		
		
	
	}
	
}

/* Output : Printing TreeSet
[Australia, England, India, South Africa, Sri Lanka]
====================================================
Using Iterator
Australia
England
India
South Africa
Sri Lanka
====================================================
Executing Methods
Using Floor method : Australia
Using Ceiling method : India
Using first method : Australia
Using last method : Sri Lanka
Using pollfirst method : Australia
Using polllast method : Sri Lanka
[England, India, South Africa]
*/

