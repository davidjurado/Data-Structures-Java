package com.ds;

public class LinkedListUDemo {

	public static void main(String[] args) {
		
		LinkedListU<String> ls=new LinkedListU<String>();
		
		ls.add("uno");
		ls.add("dos");
		ls.add("tres");
		ls.add("cuatro");
		ls.display();
		System.out.println("Delete... \n");
		ls.delete();
		ls.display();
	}

}
