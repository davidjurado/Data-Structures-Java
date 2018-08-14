package com.ds;

public class QueueArrayDemo {

	public static void main(String[] args) {
		
		QueueArray<Integer> q=new QueueArray<Integer>(5);
		
		q.Dequeue();
		q.Enqueque(10);
		q.Enqueque(11);
		q.Enqueque(12);
		q.Enqueque(13);
		q.Enqueque(14);
		q.Enqueque(15);
		System.out.println("Dequeue: "+q.Dequeue());
		System.out.println("Dequeue: "+q.Dequeue());

	}

}
