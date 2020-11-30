package com.xworkz.ThreadsConceptSynchronization;

public class Tables {

	synchronized void printTables(int num) {
		System.out.println("Thread details are: " + Thread.currentThread().getId() + " Name: "
				+ Thread.currentThread().getName());
		for(int i = 1 ; i <= 10 ; i++ ) {
			System.out.println(num + " * " + i + " = " + (num*i) );
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("Thread details are: " + Thread.currentThread().getId() + " Name: "
				+ Thread.currentThread().getName());
	}
	
}
