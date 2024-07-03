package com.ns.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

	public static void main(String[] args) {
		
		List<List<String>> list1 = Arrays.asList(Arrays.asList("nisha","namu","kittu"),Arrays.asList("singh","tunnu"),Arrays.asList("kushwah"));
		
		List<String> l =  list1.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println(l);
	}
}
