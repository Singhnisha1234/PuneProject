package com.ns.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicateElement {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,3,5,6,7,8,2,8,9,1);
		HashSet set = new HashSet();
		
		
		List<Integer> duplicateElement = list.stream().filter(n -> !set.add(n)).collect(Collectors.toList());
          System.out.println(duplicateElement);
	}
}
