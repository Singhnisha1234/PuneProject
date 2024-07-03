package com.ns.oops;

public class EncapsulationDemo extends Encapsulation {

	@Override
	public void instagram() {
		System.out.println("this is my instagram channel");
	}

	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		e.youtube();
		e.instagram();

		EncapsulationDemo demo = new EncapsulationDemo();
		demo.instagram();
		demo.youtube();
	}
}
