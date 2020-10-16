package com.xworkz.Abstaction.Assignments;

public class SyskaTrimmersTester {

	public static void main(String[] args) {
	
		SyskaTrimmers syskaTrimmers = new SyskaTrimmers();
		syskaTrimmers.setBrand("SYSKA HB 100");
		syskaTrimmers.setPrice(2600);
		syskaTrimmers.setNoOfClips(5);
		System.out.println("Brand: "+ syskaTrimmers.getBrand());
		System.out.println("Price: "+ syskaTrimmers.getPrice());
		System.out.println("No of Additional Clips : "+ syskaTrimmers.getNoOfClips());
		syskaTrimmers.trimmingBeard();
		syskaTrimmers.hairTrimming(true);
		syskaTrimmers.chargingPort(true);
		
		System.out.println("===============================================");
		
		Trimmers trimmers = new SyskaTrimmers();
		syskaTrimmers.setBrand("SYSKA HT 3050");
		syskaTrimmers.setPrice(1810);
		syskaTrimmers.setNoOfClips(1);
		System.out.println("Brand: "+ syskaTrimmers.getBrand());
		System.out.println("Price: "+ syskaTrimmers.getPrice());
		System.out.println("No of Additional Clips : "+ syskaTrimmers.getNoOfClips());
		syskaTrimmers.trimmingBeard();
		syskaTrimmers.hairTrimming(false);
		syskaTrimmers.chargingPort(true);
		
	
	}
	
}
/*Output: 

Default Constructor
Brand: SYSKA HB 100
Price: 2600.0
No of Additional Clips : 5
Bread Trimming
Hair Trimming can be done? : true
Micro USB-port available for Charging : true
===============================================
Default Constructor
Brand: SYSKA HT 3050
Price: 1810.0
No of Additional Clips : 1
Bread Trimming
Hair Trimming can be done? : false
Micro USB-port available for Charging : true
 */


