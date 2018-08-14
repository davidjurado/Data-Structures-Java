package com.ds;

public class QueueLinkedListDemo {

	public static void main(String[] args) {
		
		QueueLinkedList<String> q= new QueueLinkedList<String>();
		
		q.Dequeue();
		
		q.Enqueue("uno");
		q.Enqueue("dos");
		q.Enqueue("tres");
		q.Enqueue("cuatro");
		
		System.out.println(q.Dequeue());
		System.out.println(q.Dequeue());
		System.out.println(q.Dequeue());
		System.out.println(q.Dequeue());
		
		
	}

}
