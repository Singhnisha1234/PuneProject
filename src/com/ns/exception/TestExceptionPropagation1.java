package com.ns.exception;

public class TestExceptionPropagation1 {

	public void m() {
		int data = 50/0;
	}
	
	void n() {
		m();
	}
	void p() {
		try {
			n();
		}
		catch(Exception e){
			System.out.println("Exception handleld");
		}
		
	}
	public static void main(String[] args) {
		
		TestExceptionPropagation1 obj = new TestExceptionPropagation1();
		obj.p();
		System.out.println("normal flow");
	}
}
