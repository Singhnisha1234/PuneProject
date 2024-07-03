package com.ns.functionalInterface;


@FunctionalInterface
public interface MyFunctionalInterface {

	//Abstract Method
	void abstractMethod();
	
	boolean equals(Object obj);
	
//	//Default Method
//	default void defaultMethod() {
//		System.out.println("This is a default method in the interface");
		
		static  void staticMethod() {
			
			System.out.println("This is a static method in the interface");
		}
		
	}

