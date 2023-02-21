package org.maxx.vehicles;

import org.maxx.parent.Vehicle;

public class Bike extends Vehicle{
	private String handles;

	public Bike() {
		super();
		this.handles = "short";
	}

	public Bike(String handles,String engine, int wheels, String lights) {
		super(engine,wheels,lights);
		this.handles = handles;
	}

	public String getHandles() {
		return handles;
	}

	@Override
	public String toString() {
		return "Bike [getHandles()=" + getHandles() + ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels()
				+ ", getLights()=" + getLights() + "]";
	}
	
	public void run() {
		System.out.println("Bike is running");
		System.out.println(toString());
	}
	
	
}
