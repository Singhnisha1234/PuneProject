package com.ns.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringLength {
	public static void main(String[] args) {

		List<String> str = Arrays.asList("Nishaa", "Singh", "Kushwah", "Namu");
//	
//	List<String> l = Arrays.stream(str).sorted(Comparator.comparing(String::length).reversed()).collect(Collectors.toList());
//	System.out.println(l);

		List<String> sortedStrings = str.stream().sorted((s1, s2) -> {

			int compareByFirstLetter = Character.compare(s1.charAt(0), s2.charAt(0));
			if (compareByFirstLetter != 0) {
				return compareByFirstLetter;
			}

			return Integer.compare(s1.length(), s2.length());
		}).collect(Collectors.toList());

		System.out.println(sortedStrings);
	}
}
