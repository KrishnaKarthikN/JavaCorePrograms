package com.xworkz.staticmembers.Assignments;

public class RoadTester {

	public static void main(String[] args) {
		
		System.out.println("The Color of road : "+ Road.color);
		Road.inColor();
		Road rd = new Road("MG Road", "White Topped", true);
		rd.drive();
		rd.display();	}
	
	
}
