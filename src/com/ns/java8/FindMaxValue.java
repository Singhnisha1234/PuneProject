package com.ns.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxValue {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,4,6,7,8,9,2,3);
		
		int i = list.stream().max(Integer::compare).get();
		int in = list.stream().max(Comparator.naturalOrder()).get();
		//System.out.println("maximum number" + i);
		System.out.println("maximum number1" + in);
	}
}
