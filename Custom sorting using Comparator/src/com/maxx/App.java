package com.maxx;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class Data<K,V>{
	private K key;
	private V value;
	public Data(K key, V value) { 
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}
	
}

public class App {

	public static void main(String[] args) {
		
		Comparator<Data<Integer,String>> COMPARE_KEY = new Comparator<Data<Integer,String>>() {
			
			@Override
			public int compare(Data<Integer, String> o1, Data<Integer, String> o2) {
				if(o1.getKey() < o2.getKey()) {
					return -1;
				}else if(o1.getKey() > o2.getKey()){
					return 1;
				}else
				return 0;
			}
		};
		
		Set<Data<Integer, String>> set = new TreeSet<>(COMPARE_KEY);
		
		set.add(new Data<Integer, String>(1,"one"));
		set.add(new Data<Integer, String>(5,"Five"));
		set.add(new Data<Integer, String>(9,"Nine"));
		set.add(new Data<Integer, String>(2,"Two"));
		set.add(new Data<Integer, String>(5,"Five"));
		
		for(Data<Integer, String> element : set) {
			System.out.println(element);
		}
	}

}
