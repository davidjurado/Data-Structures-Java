package com.ds;

public class StackDArrayDemo {

	public static void main(String[] args) {
		
		StackDArray<Integer> st= new StackDArray<Integer>(2);
		
		st.push(10);
		System.out.println("Size Stack: "+st.getSize());
		st.push(11);
		System.out.println("Size Stack: "+st.getSize());
		st.push(12);
		System.out.println("Size Stack: "+st.getSize());
		st.push(13);
		System.out.println("Size Stack: "+st.getSize());
		st.push(14);
		System.out.println("Size Stack: "+st.getSize());
		st.push(15);
		System.out.println("Size Stack: "+st.getSize());
		
		while(!st.isEmpty()) {
			System.out.println("Pop: "+st.pop());
		}
		
	}

}
