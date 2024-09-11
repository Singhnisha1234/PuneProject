package com.ns.increment;

public class Demo {
	public static void main(String[] args) {

		int a = 5;
		int b = 6;
		int c = 7;

//		System.out.println(++a + ++b + ++c); // 5=6,6=7,7=8 = 21
//		System.out.println(a++ + b++ + c++); // 5+1=6, 6+1=7, 7+1=8 = 21
//		System.out.println(a); // 6+1 =7
		System.out.println(c++);
		System.out.println(++c);
		System.out.println(c);
		System.out.println(c--);
		System.out.println(--c);
		System.out.println(c);
		
	}
}
