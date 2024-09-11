package com.ns.java8;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateCharInString {
	
	public static void main(String[] args) {
		
		String s = "nishasingh";
		
		List<Character> duplicate = s.chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		              .entrySet().stream().filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
		
		System.out.println(duplicate);
	}

}
