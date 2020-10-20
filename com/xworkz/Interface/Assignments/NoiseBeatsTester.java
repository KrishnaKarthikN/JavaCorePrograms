package com.xworkz.Interface.Assignments;

public class NoiseBeatsTester {

	public static void main(String[] args) {
		
		NoiseBeats noiseBeats = new NoiseBeats();
		noiseBeats.brand = "Noise";
		noiseBeats.price = 2000.00;
		System.out.println("Brand :" + noiseBeats.brand);
		System.out.println("Price :" + noiseBeats.price);
		noiseBeats.calling();
		noiseBeats.listeningMusic();
		noiseBeats.bluetooth();
		noiseBeats.playtime();
		System.out.println("==================Upcasting===============");
		WirelessEarphones wirelessEarphones = new NoiseBeats() ;
		wirelessEarphones.brand = "Noise";
		wirelessEarphones.price = 2000.00;
		System.out.println("Brand :" + wirelessEarphones.brand);
		System.out.println("Price :" + wirelessEarphones.price);
		wirelessEarphones.calling();
		wirelessEarphones.listeningMusic();
		wirelessEarphones.bluetooth();
		wirelessEarphones.playtime();
	}
	
}


/*output : 
Brand :Noise
Price :2000.0
Good call quality!!!!!
Listening to Music
Bluetooth Connectivity
Long play time on Single Charge
==================Upcasting===============
Brand :Noise
Price :2000.0
Good call quality!!!!!
Listening to Music
Bluetooth Connectivity
Long play time on Single Charge
*/
