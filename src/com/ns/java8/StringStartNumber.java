package com.ns.java8;

import java.util.Arrays;

public class StringStartNumber {

	public static void main(String[] args) {
		
		String[] str = {"nishasinghkushwah","singh","nishasingh","nisha"};
		
		//str.stfilter(n -> Character.isDigit(n.charAt(0))).forEach(System.out::println);
		
		//String str = "nishasingh";

	//	Map<String, Long> map = Arrays.stream(str).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())); 
		//System.out.println(map);
		
		String s = Arrays.stream(str).max((n1,n2) -> Integer.compare(n1.length(), n2.length())).get();
		System.out.println(s);
	}
}
