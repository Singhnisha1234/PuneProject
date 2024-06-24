package com.ns.java8;

import java.util.Arrays;
import java.util.List;

public class FindMaxValue {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,4,6,7,8,9,2,3);
		
		int i = list.stream().max(Integer::compare).get();
		System.out.println(i);
	}
}
