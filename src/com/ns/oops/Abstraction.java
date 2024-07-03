package com.ns.oops;

abstract class Abstraction {
	
	

	public Abstraction() {
		super();
	}

	public int multiply(int a, int b) {
		System.out.println("multiply of a and b" + " = " + a * b);
		return a * b;
	}

	public abstract void divide(int a,int b);

}
