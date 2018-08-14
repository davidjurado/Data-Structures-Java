package com.ds;

import java.util.Arrays;

public class StackDArray<T> {
	Object[] ArrayStack;
	int size;
	int top;

		public StackDArray(int size) {
			this.size=size;
			ArrayStack=new Object[size];
			top=-1;
		}
		
		public boolean isEmpty() {
			return(top==-1);
		}
		
		public void push(Object newItem) {
			ensureCapacity(top+2);
			top=top+1;
			ArrayStack[top]=newItem;
		}
		
		public T pop() {
			if(isEmpty()) {
				System.out.println("Stack is empty");
				return null;
			}
			T item=(T) ArrayStack[top];
			top=top-1;
			return item;
		}
		
		public void ensureCapacity(int minCapacity) {
			int oldCapacity=ArrayStack.length;
			if(minCapacity>oldCapacity) {
				int newCapacity=oldCapacity*2;
				if(newCapacity<minCapacity)
					newCapacity=minCapacity;
				ArrayStack=Arrays.copyOf(ArrayStack, newCapacity);
			}
		}
		
		
		public int getSize() {
			return ArrayStack.length;
		}
}
