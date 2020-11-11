package com.xworkz.collections.QueueAndJGArray;

public class Pencil {

	private String brand;
	private String shape;
	private int noOfPencilsInBox;
	
	public Pencil(String brand, String shape, int noOfPencilsInBox) {
		super();
		this.brand = brand;
		this.shape = shape;
		this.noOfPencilsInBox = noOfPencilsInBox;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public int getNoOfPencilsInBox() {
		return noOfPencilsInBox;
	}
	public void setNoOfPencilsInBox(int noOfPencilsInBox) {
		this.noOfPencilsInBox = noOfPencilsInBox;
	}
	@Override
	public String toString() {
		return "Pencil [brand=" + brand + ", shape=" + shape + ", noOfPencilsInBox=" + noOfPencilsInBox + "]";
	}
	
	
}
