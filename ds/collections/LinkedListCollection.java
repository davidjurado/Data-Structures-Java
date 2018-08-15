package com.ds.collections;

import java.util.Iterator;
import java.util.LinkedList; //imported from java.util

public class LinkedListCollection {

	public static void main(String[] args) {
		
		LinkedList<String> ls = new LinkedList<String>();
		ls.add("uno");
		ls.add("dos");
		ls.add("tres");
		ls.add("cuatro");
		
		Iterator<String> itr=ls.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
