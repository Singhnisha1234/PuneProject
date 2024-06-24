package com.ns.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateRemove {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,3,4,5,6,7,8,9,10,10,1,2);
		
		List<Integer> duplicateRemove = list.stream().distinct().collect(Collectors.toList());
		
		System.out.println(duplicateRemove);
	}

}
