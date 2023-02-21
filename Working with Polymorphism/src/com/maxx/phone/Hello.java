package com.maxx.phone;

import com.maxx.Nokia;
import com.maxx.Phone;
import com.maxx.Samsung;

public class Hello {

	public static void main(String[] args) {
//		Phone nokia3310 = new Nokia("Nokia 3310");
		Phone nokia3310 = new Hello().phone(1);
		System.out.println(nokia3310.getModel());
		nokia3310.features(); //Features method of parent call will called
		
		System.out.println("-------------------------------------------");
		
//		Phone note8 = new Samsung("Note 8");
		Phone note8 = new Hello().phone(2);
		System.out.println(note8.getModel());
		note8.features(); //Feature method of child is called
		
		
		

	}
	
	public Phone phone(int dailyDriver) {
		switch(dailyDriver) {
		case 1: return new Nokia("3310");
		case 2: return new Samsung("Note 8");
		}
		return null;
	}

}
