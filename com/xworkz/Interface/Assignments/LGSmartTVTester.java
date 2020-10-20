package com.xworkz.Interface.Assignments;

public class LGSmartTVTester {

	public static void main(String[] args) {

		LGSmartTV lgSmartTV = new LGSmartTV();
		System.out.println("Brand :" + SmartTV.brand);
		System.out.println("Price :" + SmartTV.price);
		lgSmartTV.powerOff();
		lgSmartTV.powerOff();
		lgSmartTV.volumeOn();
		lgSmartTV.volumeOff();
		lgSmartTV.webConnectivity();
		lgSmartTV.androidNIosConnectivity();
		System.out.println("==========Upcasting==========");
		SmartTV smartTV = new LGSmartTV();
		System.out.println("Brand :" + SmartTV.brand);
		System.out.println("Price :" + SmartTV.price);
		smartTV.powerOff();
		smartTV.powerOff();
		smartTV.volumeOn();
		smartTV.volumeOff();
		smartTV.webConnectivity();
		smartTV.androidNIosConnectivity();
		
		
	}

}

/*Output : 
Brand :LG
Price :45000.0
Power Off TV
Power Off TV
Increase Volume in TV
Decrease Volume in TV
Internet Connectivity
Both Android & Apple Connectivity
==========Upcasting==========
Brand :LG
Price :45000.0
Power Off TV
Power Off TV
Increase Volume in TV
Decrease Volume in TV
Internet Connectivity
Both Android & Apple Connectivity
*/
