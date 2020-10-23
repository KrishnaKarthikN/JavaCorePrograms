package com.xworkz.functionalInterfaceConcept;

public class BatteryTester {

	public static void main(String[] args) {
		
		Battery phoneBattery = (voltage,brand)->System.out.println("Phone Brand : " +brand+ " ; Phone battery is charging with voltage : " + voltage +"V");
		phoneBattery.charging(3.7 , "Samsung");
		
		
	}
	
}
