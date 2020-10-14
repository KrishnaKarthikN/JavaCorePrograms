package com.xworkz.staticmembers.Assignments;

public class Road {

	String name;
	String type;
	boolean footpath;
	static String color;
	
	
	public Road (String inName, String inType, boolean inFootpath ) {
		name = inName;
		type = inType;
		footpath = inFootpath;
	}
	static void inColor() {
		color = "gray";
		System.out.println("The color of road :" + color);
	}
	void drive () {
		System.out.println("Driving");
	}
	void display() {
		System.out.println("Name : "+ name + " Type : " + type + " Footpath : " + footpath + " Color : "+ color );
	}
	
	
	
}
