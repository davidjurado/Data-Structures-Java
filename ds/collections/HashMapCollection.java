package com.ds.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapCollection {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("uno",1);
		map.put("dos",2);
		map.put("tres",3);
		map.put("veinte",20);
		map.put("cien",100);
		map.put("one hundred",100);
		
		System.out.println(map.get("cien"));
		System.out.println(map.get("one hundred"));
		
		for(Map.Entry m:map.entrySet()) {
			System.out.println("key: "+m.getKey()+", value: "+m.getValue());
		}
		
		map.remove("veinte");
		System.out.println(map.get("veinte"));
		
	}

}
