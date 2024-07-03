package com.ns.oops;

public class MainAbstraction extends Abstraction {

	
	@Override
	public void divide(int a,int b) {
		System.out.println("divide = " + a/b);
		
	
}
	public static void main(String[] args) {
		MainAbstraction main = new MainAbstraction();
		
		
		main.divide(10,2);
		main.multiply(2, 8);
		
	}
}