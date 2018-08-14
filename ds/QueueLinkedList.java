package com.ds;

public class QueueLinkedList<T> {
	
	NodeD Rear;
	NodeD Front;
	public QueueLinkedList() {
		Rear=Front=null;
	}

	public void Enqueue(Object value) {
		NodeD newNode=new NodeD(value,null,null);
		if(Rear==null||Front==null)
			Rear=Front=newNode;
		else {
			newNode.next=null;
			newNode.previous=Rear;
			Rear.next=newNode;
			Rear=newNode;
		}
	}
	
	public T Dequeue() {
		if(Rear==null||Front==null) {
			System.out.println("Queue is empty");
			return null;
		}
		T value=(T)Front.value;
		Front=Front.next;
		if(Front!=null)
			Front.previous=null;
		return value;
	}

}
