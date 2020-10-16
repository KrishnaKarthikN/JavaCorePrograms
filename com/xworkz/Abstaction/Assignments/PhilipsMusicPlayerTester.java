package com.xworkz.Abstaction.Assignments;

public class PhilipsMusicPlayerTester {
	public static void main(String[] args) {
		
		PhilipsMusicPlayer philipsMusicPlayer = new PhilipsMusicPlayer();
		philipsMusicPlayer.setBrand("Philips");
		philipsMusicPlayer.setPrice(3399);
		System.out.println("Brand: "+ philipsMusicPlayer.getBrand());
		System.out.println("Price: "+ philipsMusicPlayer.getPrice());
		System.out.println();
		philipsMusicPlayer.playingCassettes();
		philipsMusicPlayer.radio();
		philipsMusicPlayer.cdPlayer();
		philipsMusicPlayer.usbSlot();
		System.out.println("============================================");
		MusicPlayer musicPlayer = new PhilipsMusicPlayer();
		musicPlayer.setBrand("PhilipsSoundMachine");
		musicPlayer.setPrice(6199);
		System.out.println("Brand: "+ musicPlayer.getBrand());
		System.out.println("Price: "+ musicPlayer.getPrice());
		System.out.println();
		musicPlayer.playingCassettes();
		musicPlayer.radio();
		musicPlayer.cdPlayer();
		musicPlayer.usbSlot();
		

		
	}
}

/*Output

Default Constructor
Brand: Philips
Price: 3399.0

Insert Cassettes to play music
Change mode to Radio
Insert CD to CD-Driver
Plug in pendrive to access USB
============================================
Default Constructor
Brand: PhilipsSoundMachine
Price: 6199.0

Insert Cassettes to play music
Change mode to Radio
Insert CD to CD-Driver
Plug in pendrive to access USB  */
