package com.ns.javaprogram;

import java.util.Arrays;

public class Anagram {

	public static void anagram(String s1, String s2) {

		s1 = s1.toLowerCase(); // convert to lower case
		s2 = s2.toLowerCase();

		char[] ch = s1.toCharArray(); // convert to character array
		char[] ch1 = s2.toCharArray();

		Arrays.sort(ch); // convert in to ascending order
		Arrays.sort(ch1);
		
		
		if(Arrays.equals(ch, ch1)) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not anagram");
		}
	}

	public static void main(String[] args) {

		String s1 = "Heart";
		String s2 = "Earth";

		anagram(s1, s2);

	}

}
