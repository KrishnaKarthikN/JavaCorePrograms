package com.xworkz.exceptionhandlingAssignments;

public class DifferencesBtwExcptAndErr {

	public static void main(String[] args) {
		System.out.println("DIFFERENCES BETWEEN EXCEPTION AND ERROR");
		System.out.println();
		System.out.println("||*Exception Based*||");
		System.out.println("1. An exception is caused because of the code.");
		System.out.println("2. We can recover from exceptions by either using try-catch block or throwing exceptions back to caller.");
		System.out.println("3. An exception is recoverable.");
		System.out.println("4. Exceptions are classified as checked or unchecked type.");
		System.out.println("5. In Java, an exceptions are defined in\"java.lang.Exception\".");
		System.out.println("6. Checked Exceptions : NoSuchMethod, ClassNotFound.\r\n" + 
				"Unchecked Exceptions : NullPointer, IndexOutOfBounds.");
		System.out.println();
		System.out.println();
	//	System.out.println();
		System.out.println("||*Error Based*||");
		System.out.println("1. An error is caused due to lack of system resources.");
		System.out.println("2. There is no means to handle an error by the program code.");
		System.out.println("3. An error is irrecoverable.");
		System.out.println("4. Errors are classified as unchecked type.");
		System.out.println("5. In Java, errors are defined \"java.lang.Error\" package.");
		System.out.println("6. OutOfMemory, StackOverFlow.");
	}
}	
	