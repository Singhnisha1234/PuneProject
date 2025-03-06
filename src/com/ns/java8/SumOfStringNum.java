package com.ns.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class SumOfStringNum {
	
	public static void main(String[] args) {
		
		String str = "23456";
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		int i = list.stream().mapToInt(Integer::valueOf).sum();
		System.out.println(i);

		
//		int sum = Arrays.stream(str.split("")).collect(Collectors.summingInt(Integer::parseInt));
//		
//		System.out.println(sum);
	}

}
