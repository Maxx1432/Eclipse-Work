package com.maxx;

import com.maxx.shop.Door;

public class Shop {

	public static void main(String[] args) {
		Door door  = new Door();
//		System.out.println(door.getLock().isUnlocked("test"));
		
		if(door.getLock().isUnlocked(args[0])) { //using of anonymous class method isUnlocked
			System.out.println("Welcome, we are open: "+"key Is: "+args[0]);
		}else {
			System.out.println("Shop has closed");
		}
		System.out.println("---------------------------");
		if(new Door().getLock().isUnlocked(args[1])) { //using of anonymous class method isUnlocked
			System.out.println("Welcome, we are open: "+"key Is: "+args[1]);
		}else {
			System.out.println("Shop has closed");
		}
	}

}
 