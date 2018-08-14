package com.ds;

public class QueueArray<T> {
Object[] ArrayQueue;
int Rear;
int Front;
int size;

	public QueueArray(int size) {
		this.size=size;
		ArrayQueue=new Object[this.size];
		Front=Rear=-1;
	}
	
	public boolean isFull() {
		return Rear==size-1;
	}
	
	public boolean isEmpty() {
		return (Front==-1||Front>Rear);
	}

	public void Enqueque(Object newItem) {
		if(isFull()) {
			System.out.println("Queue is full");
			return;
		}
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
	
}
