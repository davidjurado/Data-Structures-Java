package com.ds;

public class StackLinkedListDemo {

	public static void main(String[] args) {
		
		StackLinkedList<String> st= new StackLinkedList<String>();
		
		st.pop();
		st.push("uno");
		st.push("dos");
		st.push("tres");
		System.out.println(st.pop());
		st.push("cuatro");
		st.push("cinco");
		st.push("seis");
		
		
	}

}
