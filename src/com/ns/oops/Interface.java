package com.ns.oops;

public interface Interface {

	static int a = 10;
	public void m1();
}

interface A{
	
}

class B implements A,Interface{

	static int a = 5;
	@Override
	public void m1() {
		System.out.println("HI");
		B b = new B();
		b.m1();
	}
	
	
	
	
	
}