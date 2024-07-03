package com.ns.java8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordOfString {

	public static void main(String[] args) {
		
		String str = "Kushwah";
		
		String s = Arrays.stream(str.split(" ")).map(i -> new StringBuffer(i).reverse()).collect(Collectors.joining(" "));
		System.out.println(s);
	}
}
