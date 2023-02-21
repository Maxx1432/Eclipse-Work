package org.maxx.vehicles;

import org.maxx.parent.Vehicle;

public class Truck extends Vehicle {
	private String steering;
	private String musicSystem;
	private String airConditioner;
	private String container;
	public Truck() {
		super();
		this.steering="Short";
		this.musicSystem="NA";
		this.airConditioner="NA";
		this.container="NA";
	}
	public Truck(String steering, String musicSystem, String airConditioner, String container,String engine, int wheels, String lights) {
		super(engine,wheels,lights);
		this.steering = steering;
		this.musicSystem = musicSystem;
		this.airConditioner = airConditioner;
		this.container = container;
	}
	public String getSteering() {
		return steering;
	}
	public String getMusicSystem() {
		return musicSystem;
	}
	public String getAirConditioner() {
		return airConditioner;
	}
	public String getContainer() {
		return container;
	}
	@Override
	public String toString() {
		return "Truck [getSteering()=" + getSteering() + ", getMusicSystem()=" + getMusicSystem()
				+ ", getAirConditioner()=" + getAirConditioner() + ", getContainer()=" + getContainer()
				+ ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels() + ", getLights()=" + getLights()
				+ "]";
	}
	
	
}
