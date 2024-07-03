package com.ns.functionalInterface;

public class MyClass implements MyFunctionalInterface {

	@Override
	public void abstractMethod() {
		System.out.println("Implementation of the abstract method");
	}
	
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		myClass.abstractMethod();
	//	myClass.defaultMethod();
		MyFunctionalInterface.staticMethod();
	}

}
