package com.ns.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PrintMultiple {

	public static void main(String[] args) {
		
	List<Integer> list = Arrays.asList(1,2,3,4,5);
	
	Stream<Integer> i =list.stream().filter(n -> n % 5== 0);
	
	System.out.println(i);
	}
}
