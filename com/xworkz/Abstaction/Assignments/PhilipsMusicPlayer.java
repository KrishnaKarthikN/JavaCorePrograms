package com.xworkz.Abstaction.Assignments;

public class PhilipsMusicPlayer extends MusicPlayer{

	@Override
	void playingCassettes() {
		System.out.println("Insert Cassettes to play music");
		
	}

	@Override
	void radio() {
		System.out.println("Change mode to Radio");
		
	}


	 void cdPlayer() {
		 System.out.println("Insert CD to CD-Driver");
	 }
	 void usbSlot() {
		 System.out.println("Plug in pendrive to access USB");
	 }
	
}
