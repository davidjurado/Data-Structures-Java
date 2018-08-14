package com.ds.hash;

public class HashTableArray<T> {
Entry[] arrayHash;
int size;

	public HashTableArray(int size) {
		this.size=size;
		arrayHash= new Entry[size];
		for (int i=0; i<size;i++)
			arrayHash[i]=new Entry();
	}
	
	int GetHash(int key) {
		return key%size;
	}
	
	public void put(int key, Object value)
	{
		int HashIndex=GetHash(key);
		Entry ArrayValue=arrayHash[HashIndex];
		Entry newtItem= new Entry(key, value);
		newtItem.next=ArrayValue.next;
		ArrayValue.next=newtItem;
	}
	
	public T get(int key) {
		T value=null;
		int HashIndex=GetHash(key);
		Entry ArrayValue= arrayHash[HashIndex];
		while(ArrayValue!=null) {
			if(ArrayValue.GetKey()==key) {
				value=(T) ArrayValue.GetValue();
				break;
			}
			ArrayValue=ArrayValue.next;
		}
		return value;
	}
}
