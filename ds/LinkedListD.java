package com.ds;

public class LinkedListD<T> {
	NodeD head;
	public LinkedListD() {
		head=null;
	}

	public void Add(Object value) {
		NodeD newNode=new NodeD(value,null,null);
		if(head==null)
			head=newNode;
		else {
			newNode.next=head;
			head.previous=newNode;
			head=newNode;
		}
	}
	
	public void Delete() {
		head=head.next;
		head.previous=null;
	}
	
	public void Display() {
	
		NodeD element=head;
		while(element!=null) {
			System.out.println((T)element.value);
			element=element.next;
		}
	}

}
