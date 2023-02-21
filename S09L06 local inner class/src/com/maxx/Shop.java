package com.maxx;

import com.maxx.shop.Door;

public class Shop {

	public static void main(String[] args) {
		Door door = new Door();
//		System.out.println(door.isLocked("qwerty"));
		
		if(door.isLocked(args[0])) {
			System.out.println("Shop has closed");
		}else {
			System.out.println("Welcome, we are open");
		}
		
		if(new Door().isLocked(args[1])) { //using of anonymous object
			System.out.println("Shop has closed");
		}else {
			System.out.println("Welcome, we are open");
		}
	}

}
