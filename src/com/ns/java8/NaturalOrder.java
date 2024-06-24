package com.ns.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NaturalOrder {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 7, 3, 5, 2, 8);

		List<Integer> naturalOrder = numbers.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(naturalOrder);
	}

}
