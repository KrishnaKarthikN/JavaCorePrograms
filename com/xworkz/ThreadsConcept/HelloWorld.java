package com.xworkz.ThreadsConcept;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Thread details are: " + Thread.currentThread().getId() + " Name: "
				+ Thread.currentThread().getName());


		Runnable hello5 = new Runnable() {
			
			@Override
			public void run() {
				
				for(int i = 0 ; i <= 5 ; i++) {
					System.out.println("Hello!!!!");
				}				
			}
		};
		Thread t1 = new Thread(hello5);
		t1.start();
		
		Runnable World10 = new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0 ; i <= 5 ; i++) {
					System.out.println("World!!!!");
				}
			}
		};
		Thread t2 = new Thread(World10);
		t2.start();
	
		System.out.println(" End of Thread : " + Thread.currentThread().getId() + " Name: "
				+ Thread.currentThread().getName());

	}

}

/* Output :
  Thread details are: 1 Name: main
Hello!!!!
Hello!!!!
Hello!!!!
Hello!!!!
Hello!!!!
Hello!!!!
 End of Thread : 1 Name: main
World!!!!
World!!!!
World!!!!
World!!!!
World!!!!
World!!!!

 */