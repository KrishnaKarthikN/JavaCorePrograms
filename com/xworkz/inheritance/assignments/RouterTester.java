package com.xworkz.inheritance.assignments;

public class RouterTester {
	
	public static void main(String[] args) {
		
		TpLink tplink = new TpLink();
		System.out.println("Considered Router is TP-Link");
		System.out.println("Number Of Antenna : "  + tplink.antenna);
		System.out.println("Number Of Devices Supported  : "  + tplink.noOFDevices);
		System.out.println("Coverage area in meters : "  + tplink.rangeInMtrs);
		System.out.println();
		System.out.println("Number Of Bnadwidths Present : "  + tplink.noOfBandwidths);
		System.out.println("Given LanPorts Slots : "  + tplink.noOfLanPorts);
		System.out.println();
		tplink.wireless();
		tplink.wifiOnOff();
		tplink.reset();
		tplink.bandwidth();
	
	}
}	
	