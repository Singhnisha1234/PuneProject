package com.ns.java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringOccurence {
	

	
	public static void main(String[] args) {
		 String input = "hello world";

	        Map<Character, Long> characterCounts = input.chars()
	                .mapToObj(c -> (char) c)
	                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	
	System.out.println(characterCounts);
	}

}
