package com.xworkz.Abstaction.Assignments;

public abstract class Trimmers {


	private String brand;
	private double price;
	private int noOfClips;
	
	Trimmers(){
		System.out.println("Default Constructor");
	}

	public Trimmers(String brand, double price, int noOfClips) {
		super();
		this.brand = brand;
		this.price = price;
		this.noOfClips = noOfClips;
	}
	
	abstract void trimmingBeard();
	abstract void hairTrimming(boolean x);
	void chargingPort(boolean x) {
		System.out.println("Micro USB-port available for Charging : " + x);
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

	public int getNoOfClips() {
		return noOfClips;
	}

	public void setNoOfClips(int noOfClips) {
		this.noOfClips = noOfClips;
	}
	
	
	
}
