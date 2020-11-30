package com.xworkz.ThreadsConceptSynchronization;

public class Multiples {

	public static void main(String[] args) {
		
		System.out.println("Thread details are: " + Thread.currentThread().getId() + " Name: "
				+ Thread.currentThread().getName());
		Tables tables = new Tables();
		
		Runnable r1 = ()->tables.printTables(3);
		Thread t1 = new Thread(r1);
		t1.start();
		
		Runnable r2 = ()->tables.printTables(4);
		Thread t2 = new Thread(r2);
		t2.start();
		
	}
	
}
