package com.maxx;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class App {

	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayBlockingQueue<>(6);
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		queue.add(6);
		
		
		for(Integer element: queue)
		{
			System.out.println(element);
		}
		
System.out.println("Poll: "+queue.poll()); // will remove the 1St element
		
		System.out.println("Offer: "+queue.offer(1)); // Will add element in queue at the end.
		
		System.out.println("peak: "+queue.peek()); // Will return the 1st element of Queue
		
		for(Integer element: queue)
		{
			System.out.println(element);
		}
	}

}
