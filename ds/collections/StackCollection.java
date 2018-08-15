package com.ds.collections;

import java.util.Stack;

public class StackCollection {

	public static void main(String[] args) {
		
		Stack<String> st= new Stack<String>();
		
		st.push("uno");
		st.push("dos");
		st.push("tres");
		st.push("cuatro");
		
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());

	}

}
