package com.ns.collection;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		
		ArrayList<String> l = new ArrayList<>();
		
		l.add("Nisha");
		l.add("Singh");
		l.add("Sing");
		l.add("anu");
		
		for(int i = 0 ; i<l.size();i++) {
			
			l.remove(1);
		}
		
		
		System.out.println(l);
	
	}
}
