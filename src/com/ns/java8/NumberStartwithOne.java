package com.ns.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartwithOne {
	
	public static void main(String[] args) {
		
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
		
		List<String> startWithOne = myList.stream().map(n -> n + "").filter( i -> i.startsWith("1")).collect(Collectors.toList());
		
		System.out.println(startWithOne);
	}

}
