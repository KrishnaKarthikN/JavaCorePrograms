package com.xworkz.Interface.Assignments;

public class LGSmartTV implements SmartTV{

	@Override
	public void powerOn() {
		System.out.println("Power On TV");
	}

	@Override
	public void powerOff() {
		System.out.println("Power Off TV");
	}

	@Override
	public void volumeOn() {
		System.out.println("Increase Volume in TV");
	}

	@Override
	public void volumeOff() {
		System.out.println("Decrease Volume in TV");
	}

	@Override
	public void webConnectivity() {
		System.out.println("Internet Connectivity");
	}

	@Override
	public void androidNIosConnectivity() {
		System.out.println("Both Android & Apple Connectivity");		
	}

}
