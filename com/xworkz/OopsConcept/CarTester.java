package com.xworkz.OopsConcept;

public class CarTester {
	public static void main(String[] args) {
		
	System.out.println("Entered car is Honda City");
	Car city = new Car();
	city.brand = "Honda";
	city.type = "Sedan"; 
	city.emmisionNorm = "BS VI";
	city.bootspace = 506 ;
	
	long phoneNum = 9741988288l;
	city.calling(phoneNum); 
	int cc = 1498;
	city.engine(cc);
	float mileage = 17.8f;
	city.transport(mileage);
	int ltrs = 40 ;
	city.tankCapacity(ltrs);
	city.gps();
	
	System.out.println();
	
	System.out.println("Entered car is Hyundai Verna");
	Car verna = new Car();
	verna.brand = "Hyundai";
	verna.type = "Sedan"; 
	verna.bootspace = 480 ;
	verna.emmisionNorm = "BS VI";
	
	phoneNum = 9741988288l;
	verna.calling(phoneNum); 
	cc = 1497;
	verna.engine(cc);
	mileage = 18.45f;
	verna.transport(mileage);
	ltrs = 45 ;
	verna.tankCapacity(ltrs);
	verna.gps();
	
	System.out.println();
	
	System.out.println("Entered car is Maruti Ciaz");
	Car ciaz = new Car();
	ciaz.brand = "Maruti";
	ciaz.type = "Sedan"; 
	ciaz.emmisionNorm = "BS VI";
	ciaz.bootspace = 510 ;
	
	phoneNum = 9741988288l;
	ciaz.calling(phoneNum);
	cc = 1462;
	ciaz.engine(cc);
	mileage = 20.43f;
	ciaz.transport(mileage);
	ltrs = 43 ;
	ciaz.tankCapacity(ltrs);
	ciaz.gps();
	
	System.out.println();
	
	System.out.println("Entered car is Toyota Yaris");
	Car yaris = new Car();
	yaris.brand = "Toyota";
	yaris.type = "Sedan"; 
	yaris.emmisionNorm = "BS VI";
	yaris.bootspace = 465 ;
	
	phoneNum = 9741988288l;
	yaris.calling(phoneNum);
	cc = 1496;
	yaris.engine(cc);
	mileage = 18.1f;
	yaris.transport(mileage);
	ltrs = 42 ;
	yaris.tankCapacity(ltrs);
	yaris.gps();
	
	
}
}