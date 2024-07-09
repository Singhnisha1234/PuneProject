package com.ns.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringStartWithNumber {
	
	public static void main(String[] args) {
		
		 List<String> strings = Arrays.asList("1apple", "banana", "2cherry", "3date", "elephant");
		 
		 List<String> list = strings.stream().filter(i -> Character.isDigit(i.charAt(0))).collect(Collectors.toList());
		 
		 System.out.println(list);
	}

}
