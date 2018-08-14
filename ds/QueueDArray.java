package com.ds;

import java.util.Arrays;

public class QueueDArray<T> {
	Object[] ArrayQueue;
	int Rear;
	int Front;
	int size;

		public QueueDArray(int size) {
			this.size=size;
			ArrayQueue=new Object[this.size];
			Front=Rear=-1;
		}
		
		public boolean isEmpty() {
			return (Front==-1||Front>Rear);
		}
		
		public int getSize() {
			return ArrayQueue.length;
		}

		public void Enqueque(Object newItem) {
			ensureCapacity(Rear+2);
			Rear++;
			ArrayQueue[Rear]=newItem;
			if(Front==-1)
				Front=0;
		}
		
		public T Dequeue() {
			if(isEmpty()) {
				System.out.println("Queue is empty");
				return null;
			}
			T ObjectOut=(T)ArrayQueue[Front];
			Front++;
			return ObjectOut;
		}
		
		public void ensureCapacity(int minCapacity) {
			int oldCapacity=getSize();
			if(minCapacity>oldCapacity) {
				int newCapacity=oldCapacity*2;
				if(newCapacity<minCapacity)
					newCapacity=minCapacity;
				ArrayQueue=Arrays.copyOf(ArrayQueue, newCapacity);
			}
		}
}
