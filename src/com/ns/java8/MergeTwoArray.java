package com.ns.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		int[] b = { 9, 8, 7 };
	
		int[] i = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();

		for (int c : i) {
			System.out.print(" " + c);
		}
	}
}
