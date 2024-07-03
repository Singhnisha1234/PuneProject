package com.ns.javaprogram;

public class StringReverse {

	public static void main(String[] args) {

		String str = "nishasingh";
//String reverse ="";
//
////char [] ch = str.toCharArray();
//
//	for(int i = str.length() - 1; i>=0 ; i--) {
//		reverse = reverse + str.charAt(i);
//	}
//	System.out.println(reverse);

		
           //Using iterative
		char[] ch = str.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.println(ch[i]);
		}

	}
}