package org.maxx;

import org.maxx.vehicles.Bike;
import org.maxx.vehicles.Car;
import org.maxx.vehicles.Truck;

public class Demo {

	public static void main(String[] args) { 
//		Car car = new Car();
		Bike bike = new Bike("Long", "125cc_Petrol", 2, "LED");
		System.out.println(bike);
//		System.out.println(bike.getEngine());
//		System.out.println(bike.getHandles());
//		System.out.println(bike.getWheels());
//		System.out.println(bike.getLights());
		
		System.out.println("*****************");
		Car car = new Car();
		System.out.println(car);
		
		System.out.println("---------------------");
		
		Car car1 = new Car("Medium", "Available", "Small_Available", "800CC_Petrol", 4, "LED");
		System.out.println(car1);
		System.out.println("*****************");
		
		Truck truck = new Truck();
		System.out.println(truck);
		
		System.out.println("---------------------");
		
		Truck truck1 = new Truck("Long", "Available", "Large_Available", "Medium_Full", "4000CC_Diesel", 8, "LED_With_FOG");
		System.out.println(truck1);
		System.out.println("*****************");
		
		
		bike.run();
	}

}
