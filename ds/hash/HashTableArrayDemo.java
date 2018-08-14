package com.ds.hash;

public class HashTableArrayDemo {

	public static void main(String[] args) {
		
		HashTableArray<String> hm= new HashTableArray<String>(10);
		
		hm.put(11, "uno");
		hm.put(12, "dos");
		hm.put(13, "tres");
		hm.put(14, "cuatro");
		System.out.println(hm.get(14));
		System.out.println(hm.get(13));
		System.out.println(hm.get(12));
		System.out.println(hm.get(11));
		System.out.println(hm.get(10));

	}

}
