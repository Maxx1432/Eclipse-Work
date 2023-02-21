package com.maxx;

public class Phone {
	public String model;

	public Phone(String model) {
		this.model = model;
	}
	
	public void features()
	{
		System.out.println("Feature Phone");
	}

	public String getModel() {
		return model;
	}
	
}
