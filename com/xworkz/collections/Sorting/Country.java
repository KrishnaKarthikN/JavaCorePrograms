package com.xworkz.collections.Sorting;

public class Country implements Comparable<Country> {

	private int noOfStates ;
	private String name;
	private double countrycode;
	
	public Country(int noOfStates, String name, double countrycode) {
		super();
		this.noOfStates = noOfStates;
		this.name = name;
		this.countrycode = countrycode;
	}
	public int getNoOfStates() {
		return noOfStates;
	}
	public void setNoOfStates(int noOfStates) {
		this.noOfStates = noOfStates;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(double countrycode) {
		this.countrycode = countrycode;
	}
	@Override
	public String toString() {
		return "Country [noOfStates=" + noOfStates + ", name=" + name + ", countrycode=" + countrycode + "]";
	}
	
	
	@Override
    public int compareTo(Country o) {
        return this.noOfStates - o.noOfStates;
    }
	
}
