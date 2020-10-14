package com.xworkz.staticmembers.classExamples;

public class Trainee {
	
	String name;
	String emailId;
	int age;
	long phoneNum;
	String organization;
	
	public Trainee(String inName, String inEmail, int inAge, long inPhoneNum, String inOrganization ) {
		name = inName;
		emailId = inEmail;
		age = inAge;
		phoneNum = inPhoneNum;
		organization = inOrganization;
	
	}
	
	
	void doingAssignments() {
		System.out.println("Doing Assignments");
	}
	void displayDetails() {
		System.out.println("Name : " + name + "EmailId : " + emailId + "Age : " + age + "Number : " + phoneNum + "Organization : " + organization); 
	}
	
	
}
