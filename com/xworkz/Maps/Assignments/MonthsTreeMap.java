package com.xworkz.Maps.Assignments;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MonthsTreeMap {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> months = new TreeMap<String, Integer>();
		months.put("January", 31);
		months.put("February", 28);
		months.put("March", 31);
		months.put("April", 30);
		months.put("May", 31);
		months.put("June", 30);
		months.put("July", 31);
		months.put("August", 31);
		months.put("September", 30);
		months.put("October", 31);
		months.put("November", 30);
		months.put("December", 31);
		System.out.println(months);
		System.out.println("==================================================================");
		System.out.println("Using Entry Set");
		Set<Entry<String, Integer>> entry = months.entrySet();
		for (Entry<String, Integer> ent : entry) {
			System.out.println("Key : " + ent.getKey() + " Value : " + ent.getValue());
		}
		System.out.println("==================================================================");
		System.out.println("Using ForEach");
		months.forEach((k,v)->System.out.println("key:" + k +  " value: " + v));
	}

}

/* Output : 
{April=30, August=31, December=31, February=28, January=31, July=31, June=30, March=31, May=31, November=30, October=31, September=30}
==================================================================
Using Entry Set
Key : April Value : 30
Key : August Value : 31
Key : December Value : 31
Key : February Value : 28
Key : January Value : 31
Key : July Value : 31
Key : June Value : 30
Key : March Value : 31
Key : May Value : 31
Key : November Value : 30
Key : October Value : 31
Key : September Value : 30
==================================================================
Using ForEach
key:April value: 30
key:August value: 31
key:December value: 31
key:February value: 28
key:January value: 31
key:July value: 31
key:June value: 30
key:March value: 31
key:May value: 31
key:November value: 30
key:October value: 31
key:September value: 30
*/