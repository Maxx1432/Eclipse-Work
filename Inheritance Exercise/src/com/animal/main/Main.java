package com.animal.main;

import com.animal.bird.Eagle;
import com.animal.parent.Animal;

public class Main {

	public static void main(String[] args) {
		Animal animal = new Animal();
		System.out.println(animal.toString());
		
		Eagle eagle = new Eagle();
		System.out.println(eagle.toString());

	}

}
