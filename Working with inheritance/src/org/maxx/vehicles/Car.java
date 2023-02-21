package org.maxx.vehicles;

import org.maxx.parent.Vehicle;

public class Car extends Vehicle{
	private String steering;
	private String airconditioner;
	private String fridge;
	public Car() {
		super();
		this.steering="Short";
		this.airconditioner="Small";
		this.fridge="NA";
	}
	public Car(String steering, String airconditioner, String fridge,String engine, int wheels, String lights) {
		super(engine,wheels,lights);
		this.steering = steering;
		this.airconditioner = airconditioner;
		this.fridge = fridge;
	}
	public String getSteering() {
		return steering;
	}
	public String getAirconditioner() {
		return airconditioner;
	}
	public String getFridge() {
		return fridge;
	}
	@Override
	public String toString() {
		return "Car [getSteering()=" + getSteering() + ", getAirconditioner()=" + getAirconditioner() + ", getFridge()="
				+ getFridge() + ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels() + ", getLights()="
				+ getLights() + "]";
	}
	
	
}
