package com.xworkz.Interface.Assignments;

public class NoiseBeats extends WirelessEarphones {

	@Override
	public void calling() {
		System.out.println("Good call quality!!!!!");
	}

	@Override
	public void listeningMusic() {
		System.out.println("Listening to Music");
	}

	@Override
	void bluetooth() {
		System.out.println("Bluetooth Connectivity");
	}

	@Override
	void playtime() {
		System.out.println("Long play time on Single Charge");		
	}

}
