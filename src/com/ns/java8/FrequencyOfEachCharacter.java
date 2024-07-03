package com.ns.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacter {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("nishaSingh","nisha","singh","mishasingh");
		
		Map<String , Long> l = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(l);
	}
}
