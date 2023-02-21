package org.studyeasy;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class App {

	public static void main(String[] args) {
		List<String> countries = new LinkedList<>();
		countries.add("India");
		countries.add("USA");
		countries.add("Poland");
		countries.add("Egypt");
		countries.add("Thailand");
		countries.add("Russia");

		List<String> sortedCountries = new LinkedList<>();
		sortedCountries.add(countries.get(0));
		for (int i = 0; i < countries.size(); i++) {
			ListIterator<String> iterator = countries.listIterator();
			int flag;
			while (iterator.hasNext()) {
				flag = iterator.next().compareTo(sortedCountries.get(i));
				if(flag == 0){
					continue;
				}else if(flag <0){
					sortedCountries.set(i, iterator.previous());
					iterator.next();
					continue;
				}else {
					iterator.next();
				}
			}
			sortedCountries.add(i, countries.get(i));
		}
		 new App().printList(sortedCountries);
	}

	void printList(List<String> list) {

		ListIterator<String> iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.println("Element: " + iterator.next());
		}
	}

}
