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
		new App().printList(countries);
	}
     void printList(List<String> list){
    	 
    	ListIterator<String> iterator = list.listIterator();
    	 while(iterator.hasNext()){
    		 System.out.println("Element: "+iterator.next());
    	 }
     }
	
	
}
