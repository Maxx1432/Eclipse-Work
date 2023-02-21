package org.studyeasy;

import java.util.ArrayList;

public class App {

	static ArrayList<String> listNames = new ArrayList<>();
	
	public static void main(String[] args) {
		listNames.add("Chaand");
		listNames.add("John");
		listNames.add("Steve");
		listNames.add("Pooja");
		listNames.add("Salim");
		listNames.add("Rahul");
		listNames.add("Mia");
		listNames.add("Angel");
		App app = new App();
		app.displayList(listNames);	
		System.out.println("************");
        int position = app.search("Pooja");
        if(position != -1){
        	app.modifyName(position, "Emma");
        	app.displayList(listNames);	
        }else{
        	System.out.println("Invalid entry");
        }
		
	}
	void displayList(ArrayList<String> names){
		for(String name: names){
			System.out.println(name);
		}	
	}
	void modifyName(int position, String newName){
		listNames.set(position, newName);
	}
	
	int search(String name){
		return listNames.indexOf(name);
	}

}
