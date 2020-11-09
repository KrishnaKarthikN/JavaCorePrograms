package com.xworkz.collections.Sorting;

import java.util.ArrayList;
import java.util.Collections;


public class CountryTester {

	public static void main(String[] args) {
		
		Country c1 = new Country(50, "United States of America", 1);
		Country c2 = new Country(29, "India", 91);
		Country c3 = new Country(21, "Russia", 7);
		Country c4 = new Country(18, "Hong Kong", 852);
		Country c5 = new Country(5, "Singapore", 65);
		
		ArrayList<Country> countryAL = new ArrayList<Country>();
		countryAL.add(c1);
		countryAL.add(c2);
		countryAL.add(c3);
		countryAL.add(c4);
		countryAL.add(c5);
		
		for (Country country : countryAL) {
			System.out.println(country);
		}
		
		System.out.println("After Ascending sorting");
		Collections.sort(countryAL);
		System.out.println(countryAL);
		
		System.out.println("After Decending sorting");
		Collections.reverse(countryAL);
		System.out.println(countryAL);
	}

}
/*output : Country [noOfStates=50, name=United States of America, countrycode=1.0]
Country [noOfStates=29, name=India, countrycode=91.0]
Country [noOfStates=21, name=Russia, countrycode=7.0]
Country [noOfStates=18, name=Hong Kong, countrycode=852.0]
Country [noOfStates=5, name=Singapore, countrycode=65.0]
After Ascending sorting
[Country [noOfStates=5, name=Singapore, countrycode=65.0], Country [noOfStates=18, name=Hong Kong, countrycode=852.0], Country [noOfStates=21, name=Russia, countrycode=7.0], Country [noOfStates=29, name=India, countrycode=91.0], Country [noOfStates=50, name=United States of America, countrycode=1.0]]
After Decending sorting
[Country [noOfStates=50, name=United States of America, countrycode=1.0], Country [noOfStates=29, name=India, countrycode=91.0], Country [noOfStates=21, name=Russia, countrycode=7.0], Country [noOfStates=18, name=Hong Kong, countrycode=852.0], Country [noOfStates=5, name=Singapore, countrycode=65.0]]
*/
