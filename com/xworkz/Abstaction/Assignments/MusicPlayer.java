package com.xworkz.Abstaction.Assignments;

public abstract class MusicPlayer {

	private String brand;
	private double price;
	
	MusicPlayer(){
		System.out.println("Default Constructor");
	}

	public MusicPlayer(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	
	abstract void playingCassettes();
	abstract void radio();
	 void cdPlayer() {
		 System.out.println("Insert CD to CD-Driver");
	 }
	 void usbSlot() {
		 System.out.println("Plug in pendrive to access USB");
	 }
	

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
