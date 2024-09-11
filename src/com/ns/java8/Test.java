package com.ns.java8;

import java.util.ArrayList;

public class Test  {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(1);
		al.add(0);
		al.add(1);
		
		al.remove(0);
		
	System.out.println(al.size());
	}
}
