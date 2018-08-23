package com.ds.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetCollection {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>(); //Implemented using a hash table
		
		hs.add("uno");
		hs.add("dos");
		hs.add("tres");
		hs.add("cuatro");
		hs.add("uno"); //just unique values are added
		
		Iterator<String> itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//TreeSet
		
		TreeSet<String> ts = new TreeSet<String>(); //implemented using a tree structure
		
		ts.add("uno");
		ts.add("dos");
		ts.add("tres");
		ts.add("cuatro");
		ts.add("uno"); //just unique values are added
		
		Iterator<String> itr2=ts.iterator();
		System.out.println("\n");
		while(itr2.hasNext()) {
			System.out.println(itr2.next()); //alphabetical order
		}

	}

}
