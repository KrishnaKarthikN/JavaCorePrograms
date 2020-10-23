package com.xworkz.AnonymousClasses.Assignments;

public interface MailBox {

	void sendingMail();
	void receivingMail();
	default void drafts() {
		System.out.println("Incomplete mails in drafts");
	}
	
}
