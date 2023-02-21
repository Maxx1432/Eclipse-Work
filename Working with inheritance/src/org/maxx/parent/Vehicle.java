package org.maxx.parent;

public class Vehicle {
	private String engine;
	private int wheels;
	private String lights;
	
	public String getEngine() {
		return engine;
	}

	public int getWheels() {
		return wheels;
	}

	public String getLights() {
		return lights;
	}

	public Vehicle() {
		this.engine="cc_Petrol";
		this.wheels=4;
		this.lights="LED";
	}
	
	public Vehicle(String engine, int wheels, String lights) {
		this.engine = engine;
		this.wheels = wheels;
		this.lights = lights;
	}
	
	public void run() {
		System.out.println("Vehicle is Running");
	}
	
}
