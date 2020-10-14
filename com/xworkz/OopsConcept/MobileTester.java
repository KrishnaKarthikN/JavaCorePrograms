package com.xworkz.OopsConcept;

public class MobileTester {

	public static void main(String[] args) { // calling function
		System.out.println("Begin");
		
		Mobile onePlusSix = new Mobile();  // new Mobile ==> Constructors ==> mobile objects gets created
		onePlusSix.os = "Android";
		onePlusSix.company = "OnePlus";
		onePlusSix.ramInGB = 6;
		onePlusSix.camPixel = 48.00f ;
		onePlusSix.price = 32000 ; 
		
		long phoneNum = 9741988288l;
		onePlusSix.calling(phoneNum);   //calling method
		onePlusSix.takingPic();
		onePlusSix.gaming();
		
		Mobile iPhone11 = new Mobile();
		iPhone11.os = "IOS";
		iPhone11.company = "Apple";
		iPhone11.ramInGB = 4;
		iPhone11.camPixel = 48.00f ;
		iPhone11.price = 98000 ;
		
		phoneNum = 9741988288l;
		iPhone11.calling(phoneNum);   //calling method
		iPhone11.takingPic();
		iPhone11.gaming();
		
		
		
		System.out.println("End");
	}

}
