package com.ds.collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueCollection {

	public static void main(String[] args) {
		
		//basic queue
		Queue<Integer> q= new LinkedList<Integer>();//LinkedList 
		
		q.add(14);
		q.add(11);
		q.add(13);
		q.add(12);
		q.add(10);
		
		while(!q.isEmpty())
			System.out.println("Basic queue: "+q.poll());
		
		//priority queue
		PriorityQueue<Integer> pq= new PriorityQueue<Integer>();
		
		pq.add(14);
		pq.add(11);
		pq.add(13);
		pq.add(12);
		pq.add(10);
		
		while(!pq.isEmpty())
			System.out.println("Priority queue: "+pq.poll());
		
		//class priority queue
		PriorityQueue<person> persons= new PriorityQueue<person>();
		
		persons.add(new person("David",23));
		persons.add(new person("Anna",57));
		persons.add(new person("Jhon",12));
		persons.add(new person("Zac",8));
		persons.add(new person("Mike",20));
		
		while(!persons.isEmpty())
			System.out.println("Class priority queue: "+persons.poll().name);
		
		
	}
	
	static class person implements Comparable<person>{
		String name;
		int age;
		public person(String name, int age) {
			this.name=name;
			this.age=age;
		}
		@Override
		public int compareTo(person o) {
			if(this.age==o.age)
				return 0;
			else if(this.age>o.age)
				return 1;
			else
				return -1;
		}
	}

}
