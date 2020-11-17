package com.xworkz.collections.set.TreesetExample;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class CricketBatsTester {

	public static void main(String[] args) {
			
		CricketBats ss = new CricketBats("SS","English Willow", 23200);
		CricketBats gm = new CricketBats("GM","Kashmir Willow", 24575);
		CricketBats spartan = new CricketBats("SPARTAN","English Willow" , 38318);
		
		Comparator<CricketBats> name = (o1,o2)-> o1.getName().compareTo(o2.getName());
		Comparator<CricketBats> price = (o1,o2)-> o1.getPrice() - o2.getPrice();
		System.out.println("Sorting based on Names");
		TreeSet<CricketBats> cricketBatName = new TreeSet<CricketBats>(name);
		cricketBatName.add(ss);
		cricketBatName.add(gm);
		cricketBatName.add(spartan);
		System.out.println(cricketBatName);
		System.out.println("Sorting based on Price");
		TreeSet<CricketBats> cricketBatPrice = new TreeSet<CricketBats>(price);
		cricketBatPrice.add(ss);
		cricketBatPrice.add(gm);
		cricketBatPrice.add(spartan);
		System.out.println(cricketBatPrice);
		System.out.println("====================================================");
		System.out.println("Using Iterator for Names");
		Iterator<CricketBats> itr = cricketBatName.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("====================================================");
		System.out.println("Executing Methods");
		System.out.println("Using Floor method : " + cricketBatName.floor(ss));
		System.out.println("Using Ceiling method : " + cricketBatName.ceiling(gm));
		System.out.println("Using first method : " + cricketBatName.first());
		System.out.println("Using last method : " + cricketBatName.last());
		System.out.println("Using pollfirst method : " + cricketBatName.pollFirst());
		System.out.println("Using polllast method : " + cricketBatName.pollLast());
		System.out.println(cricketBatName);
	
	}

}

/* Output : Sorting based on Names
[CricketBats [name=GM, willowtype=Kashmir Willow, price=24575], CricketBats [name=SPARTAN, willowtype=English Willow, price=38318], CricketBats [name=SS, willowtype=English Willow, price=23200]]
Sorting based on Price
[CricketBats [name=SS, willowtype=English Willow, price=23200], CricketBats [name=GM, willowtype=Kashmir Willow, price=24575], CricketBats [name=SPARTAN, willowtype=English Willow, price=38318]]
====================================================
Using Iterator for Names
CricketBats [name=GM, willowtype=Kashmir Willow, price=24575]
CricketBats [name=SPARTAN, willowtype=English Willow, price=38318]
CricketBats [name=SS, willowtype=English Willow, price=23200]
====================================================
Executing Methods
Using Floor method : CricketBats [name=SS, willowtype=English Willow, price=23200]
Using Ceiling method : CricketBats [name=GM, willowtype=Kashmir Willow, price=24575]
Using first method : CricketBats [name=GM, willowtype=Kashmir Willow, price=24575]
Using last method : CricketBats [name=SS, willowtype=English Willow, price=23200]
Using pollfirst method : CricketBats [name=GM, willowtype=Kashmir Willow, price=24575]
Using polllast method : CricketBats [name=SS, willowtype=English Willow, price=23200]
[CricketBats [name=SPARTAN, willowtype=English Willow, price=38318]]
*/