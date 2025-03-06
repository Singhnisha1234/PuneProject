package com.ns.java8;

import java.util.stream.IntStream;

public class StringPallindrome {

	public static void main(String[] args) {
		
		String str ="mada";
		
		boolean s = IntStream.range(0, str.length()/2).allMatch(i -> str.charAt(i) == str.charAt(str.length()-i-1) );
		
		//System.out.println(s);
		//     n    != 
		
		if(s) {
		System.out.println("is pallindrome");	
		}else {
			System.out.println("not pallindrome");
		}
	}
}
