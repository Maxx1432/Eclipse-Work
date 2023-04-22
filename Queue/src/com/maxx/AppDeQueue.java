package com.maxx;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class AppDeQueue {

	public static void main(String[] args) {
		Deque<Integer> dequeue = new LinkedBlockingDeque<>(); 
		
		dequeue.add(1);
		dequeue.add(2);
		dequeue.add(3);
		dequeue.add(4);
		dequeue.add(5);
		dequeue.add(6);
		
		
	}

}
