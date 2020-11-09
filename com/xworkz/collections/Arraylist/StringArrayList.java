package com.xworkz.collections.Arraylist;

import java.util.ArrayList;

public class StringArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> weekDays = new ArrayList<String>();
		weekDays.add("Monday");
		weekDays.add("Tuesday");
		weekDays.add("Wednesday");
		weekDays.add(3,"Thursday");
		weekDays.add(null);
		weekDays.add("Monday");
		System.out.println(weekDays.size());
		System.out.println(weekDays.contains("Monday"));
		System.out.println(weekDays.get(2));
		System.out.println(weekDays.remove("Tuesday"));
		System.out.println(weekDays.set(1, "Tuesday"));//updating value
		System.out.println("Week : " + weekDays);
		
		
	}

}
