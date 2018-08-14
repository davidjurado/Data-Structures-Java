package com.ds;

public class LinkedListDDemo {

	public static void main(String[] args) {
		
		LinkedListD<String> ls=new LinkedListD<String>();
		
		ls.Add("uno");
		ls.Add("dos");
		ls.Add("tres");
		ls.Add("cuatro");
		ls.Display();
		System.out.println("Delete... \n");
		ls.Delete();
		ls.Display();

	}

}
