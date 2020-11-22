package com.xworkz.Maps.Assignments;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class AadharCard {


public static void main(String[] args) {
		
	
		LinkedHashMap<Integer,String> aadhar = new LinkedHashMap<Integer,String>();
				
		
				
		aadhar.put(967898888,"Krishna" );
		aadhar.put(967894467,"Karthik");
		aadhar.put(968989999,"Arjun");
		aadhar.put(236762351,"Bheeshma");
				
		System.out.println(aadhar);
			
		aadhar.put(999745777,"Ganesha");
		aadhar.put(958765555,"John");
		
		aadhar.forEach((k,v)->System.out.println("key:" + k +  " value: " + v));
        
		System.out.println("============================================================");
		Set<Integer> keyset=aadhar.keySet();
		
		for(Integer ikey : keyset) {
			System.out.println("key :"+ikey + " value :"+aadhar.get(ikey));
		}
		System.out.println("============================================================");
		Set<Entry<Integer,String>> entry=aadhar.entrySet();
		
		for(Entry<Integer,String> ival : entry) {
			System.out.println("key :"+ival.getKey()+ " value :"+ival.getValue());
		}
		
		

}
}

/* Output : 
{967898888=Krishna, 967894467=Karthik, 968989999=Arjun, 236762351=Bheeshma}
key:967898888 value: Krishna
key:967894467 value: Karthik
key:968989999 value: Arjun
key:236762351 value: Bheeshma
key:999745777 value: Ganesha
key:958765555 value: John
============================================================
key :967898888 value :Krishna
key :967894467 value :Karthik
key :968989999 value :Arjun
key :236762351 value :Bheeshma
key :999745777 value :Ganesha
key :958765555 value :John
============================================================
key :967898888 value :Krishna
key :967894467 value :Karthik
key :968989999 value :Arjun
key :236762351 value :Bheeshma
key :999745777 value :Ganesha
key :958765555 value :John
*/