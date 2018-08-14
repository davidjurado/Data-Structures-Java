package com.ds;

public class QueueDArrayDemo {

	public static void main(String[] args) {
		
		QueueDArray<Integer> q= new QueueDArray<Integer>(2);
		
		q.Enqueque(10);
		System.out.println("Size: "+q.getSize());
		q.Enqueque(11);
		System.out.println("Size: "+q.getSize());
		q.Enqueque(12);
		System.out.println("Size: "+q.getSize());
		q.Enqueque(13);
		System.out.println("Size: "+q.getSize());
		q.Enqueque(14);
		System.out.println("Size: "+q.getSize());
		q.Enqueque(15);
		System.out.println("Size: "+q.getSize());
		
		System.out.println("Dequeue: "+q.Dequeue());
		System.out.println("Size: "+q.getSize());
		

	}

}
