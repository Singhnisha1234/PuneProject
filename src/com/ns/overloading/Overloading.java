package com.ns.overloading;

public class Overloading {

	public void sum(StringBuffer sb) {
		System.out.println("string buffer");
	}

	public void sum(String o) {
		System.out.println("String");
	}

	public static void main(String[] args) {

		Overloading o = new Overloading();

		o.sum(new StringBuffer("nisha"));
		//o.sum(null);
		o.sum("nisha");
	}
}
