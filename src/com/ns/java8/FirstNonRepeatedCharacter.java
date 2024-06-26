package com.ns.java8;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
	
	public static void main(String[] args) {
		
		String input = "Java articles are Awesome";
		
		Character result = input.chars()
				.mapToObj(n -> Character.toLowerCase(Character.valueOf((char) n)))
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap :: new , Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() ==1L).map(entry -> entry.getKey())
				.findFirst().get();
		
		System.out.println(result);
		
	}

}
