package com.ns.collection;

import java.util.ArrayList;
import java.util.HashSet;

public class ConvertObject {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Mango");
		al.add("Orange");
		al.add("Orange");
		
		
		HashSet<String> hs = new HashSet<>(al);
		System.out.println(hs);
	}
}
