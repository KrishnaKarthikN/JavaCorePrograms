package com.xworkz.collections.QueueAndJGArray;

public class Mobile implements Comparable<Mobile> {

	private String brand;
	private int noOfCameras;
	private String color;
	private int ramInGB;
	public Mobile(String brand, int noOfCameras, String color, int ramInGB) {
		super();
		this.brand = brand;
		this.noOfCameras = noOfCameras;
		this.color = color;
		this.ramInGB = ramInGB;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getNoOfCameras() {
		return noOfCameras;
	}
	public void setNoOfCameras(int noOfCameras) {
		this.noOfCameras = noOfCameras;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getRamInGB() {
		return ramInGB;
	}
	public void setRamInGB(int ramInGB) {
		this.ramInGB = ramInGB;
	}
	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", noOfCameras=" + noOfCameras + ", color=" + color + ", ramInGB=" + ramInGB
				+ "]";
	}
	@Override
	public int compareTo(Mobile o) {
		return this.getRamInGB() - o.getRamInGB();
	}
	
	
	
}
