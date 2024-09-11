package com.ns.array;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		int[] it = { 3, 2, 1, 4, 5, 6 };

		// Accessing element           //3
		int first = it[0]; 

		int last = it[it.length - 1]; // 6

		// Modifing element
		it[1] = 10;

		// Sorting the array          // 1,2,3,4,5,6
		Arrays.sort(it);
		
		//Binary search 
		int index = Arrays.binarySearch(it, 3);
		
		//Filling an array with a specific value
		int[] fillArray = new int[5];

		// Iterating over Arrays using for loop
		for (int i = 0; i < it.length; i++) {
		}

		// Using an inhanced for loop
		for (int number : it) {
			System.out.println(number);
		}

		// System.out.println(it[0]);
		System.out.println(Arrays.toString(it));

	}
}
