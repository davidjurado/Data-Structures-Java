package com.ds.collections;

import java.util.ArrayList; //imported from java.util

public class ArrayListCollection {

	public static void main(String[] args) {
		
		ArrayList<String> ar= new ArrayList<String>();
		
		ar.add("cero");
		ar.add("uno");
		ar.add("dos");
		ar.add("tres");
		
		for(String st:ar)
			System.out.println(st);
		
		System.out.println("Element at index 1: "+ar.get(1));
		ar.remove(1);//
		System.out.println("Element at index 1: "+ar.get(1)); //elements were shifted

		
		//array class
		ArrayList<person> persons = new ArrayList<person>();
		persons.add(new person("David",23));
		persons.add(new person("Jhon",2));
		persons.add(new person("Steve",15));
		
		for(person per:persons)
			System.out.println(per.name+"-"+per.age);
		
	}
	
	static class person{
		String name;
		int age;
		public person(String name, int age) {
			this.name=name;
			this.age=age;
		}
	}
	

}
