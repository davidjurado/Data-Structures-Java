package com.ds;

public class LinkedListU<T> {
Node head;
	public LinkedListU() {
		head=null;
	}
	
	public void add(Object value) {
		Node newNode=new Node(value,null);
		if(head==null)
			head=newNode;
		else {
			newNode.next=head;
			head=newNode;
		}
	}
	
	public void delete() {
		head=head.next;
	}
	
	public void display() {
	
		Node element=head;
		while(element!=null) {
			System.out.println((T)element.value);
			element=element.next;
		}
	}

}
