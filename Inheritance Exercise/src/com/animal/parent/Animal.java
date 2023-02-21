package com.animal.parent;

public class Animal {
	private double height;
	private double weight;
	private String animaltype;
	private String bloodType;
	public Animal() {
		super();
		this.height = 0.0;
		this.weight = 0.0;
		this.animaltype ="NA";
		this.bloodType = "NA";
	}
	public Animal(double height, double weight, String animaltype, String bloodType) {
		super();
		this.height = height;
		this.weight = weight;
		this.animaltype = animaltype;
		this.bloodType = bloodType;
	}
	
	
	@Override
	public String toString() {
		return "Animal [height=" + height + ", weight=" + weight + ", animaltype=" + animaltype + ", bloodType="
				+ bloodType + "]";
	}
	
}

