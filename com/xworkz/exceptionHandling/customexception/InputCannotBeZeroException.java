package com.xworkz.exceptionHandling.customexception;

public class InputCannotBeZeroException extends ArithmeticException {
	public InputCannotBeZeroException() {
		super("You have Entered Zero, Please Enter a Non-Zero Element");
	}
}
