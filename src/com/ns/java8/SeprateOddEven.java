package com.ns.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeprateOddEven {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(12,23,43,54,65,76,78);
		
		Map<Boolean, List<Integer>> i =list.stream().collect(Collectors.partitioningBy(n -> n %2 == 0));
		System.out.println(i);
	}

}
