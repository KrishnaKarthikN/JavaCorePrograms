package com.xworkz.Maps.Assignments;

import java.util.HashMap;

public class Trainee {

	public static void main(String[] args) {
		
		HashMap<String, Integer> trainee = new HashMap<String, Integer>();
		trainee.put("Krishna", 14);
		trainee.put("Dhananjay", 15);
		trainee.put("Subhash", 13);
		trainee.put("John", 10);
		System.out.println(trainee);
		System.out.println("==================================================================");
		System.out.println("Using ForEach");
		trainee.forEach((k,v)->System.out.println("key:" + k +  " value: " + v));
	
		
		
	}

}
/* Output : 
{Krishna=14, Dhananjay=15, John=10, Subhash=13}
==================================================================
Using ForEach
key:Krishna value: 14
key:Dhananjay value: 15
key:John value: 10
key:Subhash value: 13
*/