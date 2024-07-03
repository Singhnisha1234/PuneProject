package com.ns.overloading;

public class OverridingMain {

	public static void main(String[] args) {

		Overriding1 o = new Overriding1();
		Overriding2 o2 = new Overriding2();
		Overriding1 o3 = new Overriding2();

		System.out.println("sum of a + b  = " + o.task(12, 23));

		System.out.println("multiply of a * b = " + o2.task(2, 34));
		
		System.out.println(o3.task(1, 2));

	}
}
