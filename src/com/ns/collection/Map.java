package com.ns.collection;

import java.util.HashMap;

public class Map {

	public static final String Entry = null;

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap<>();
		
		hm.put(1, "nisha");
		hm.put(2, "namu");
		hm.put(4, "lata");
		hm.put(3, "isha");
		hm.put(3, "ishani");
		
		hm.put(null, null);
		hm.put(5, null);
		
		//Replacing value
		hm.replace(1, "singh");
		
		//clearing the hashMap
		//hm.clear();

		//Access element
		System.out.println("Value at key 1 :" + hm.get(1)  );

//		System.out.println(hm.size());
		System.out.println(hm);
		
		
	}
}
