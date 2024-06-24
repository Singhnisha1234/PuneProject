package com.ns.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseOrder {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,3,5,7,9,10,4);
		
		List<Integer> reverseOrder = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
          System.out.println(reverseOrder);
	}
}
