package com.search;

public class DataSet {
	int data[];
	int NumberTry;
	
	public DataSet(int size) {
		
		data=new int[size];
		for(int i=0;i<size;i++) {
			data[i]=i+1;
		}
		NumberTry=0;
	}
	
	public int getSize() {
		return data.length;
	}

}
