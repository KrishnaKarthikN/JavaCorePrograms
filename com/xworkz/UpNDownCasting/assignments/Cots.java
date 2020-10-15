package com.xworkz.UpNDownCasting.assignments;

public class Cots extends RoyalOak{
	private double weight;
	private boolean ishydraulic ;
	
	Cots(){
		System.out.println("Default constructor");
	}

	public Cots(double weight, boolean ishydraulic) {
		super();
		this.weight = weight;
		this.ishydraulic = ishydraulic;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isHydraulic() {
		return ishydraulic;
	}

	public void setHydraulic(boolean ishydraulic) {
		this.ishydraulic = ishydraulic;
	}
	
	void displayDetails() {
		System.out.println("Brand : "+ getBrand() + "; Size Type : " + getSizeType() + "; Price : " + getPrice() +"; Weight In Kgs : "+ weight + "; Hydraulic " + ishydraulic );
	}
	
	
}
