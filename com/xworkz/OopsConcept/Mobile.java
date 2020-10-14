package com.xworkz.OopsConcept;

public class Mobile {
	//instance variables (inside class) / fields / representation of states / data numbers
	String company;
	String os;
	int ramInGB;
	float camPixel;
	double price;
	//behaviour : calling , takingPic , gaming --> methods / functions
	public void calling(long phoneNum) {
		System.out.println("Calling..." + phoneNum);
	}
	public void takingPic() {
		System.out.println("Take pictures");
	}
	public void gaming() {
		System.out.println("Playing games");
	}
}
