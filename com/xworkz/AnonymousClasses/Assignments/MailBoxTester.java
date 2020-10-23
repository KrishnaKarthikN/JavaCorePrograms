package com.xworkz.AnonymousClasses.Assignments;

public class MailBoxTester {

	public static void main(String[] args) {
		
		MailBox mailBox = new MailBox() {
			
			@Override
			public void sendingMail() {
				System.out.println("Mail is sent");
			}
			
			@Override
			public void receivingMail() {
				System.out.println("Mail is received");
			}
		};
		mailBox.sendingMail();
		mailBox.receivingMail();
		mailBox.drafts();
		
		
	}
	
}

/*outputs:
Mail is sent
Mail is received
Incomplete mails in drafts
*/

