package com.maxx.shop;



public class Door {
	Lock lock = new Lock() { //anonymous Inner class
		@Override
		public boolean isUnlocked(String keyCode) {
			if(keyCode.equals("qwerty")) {
				return true;
			} else {
				return false;
			}
		}
	};

	public Lock getLock() {
		return lock;
	}
	
}
