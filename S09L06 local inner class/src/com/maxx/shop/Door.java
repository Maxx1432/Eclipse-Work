package com.maxx.shop;

public class Door {
	public boolean isLocked(String key) {
		class Lock{ //Lock is dependent on Door
			public boolean isLocked(String key) {
				if(key.equals("qwerty")) {
					return false;
				} else {
					return true;
				}
			}
		}
		return new Lock().isLocked(key);
	}
}
