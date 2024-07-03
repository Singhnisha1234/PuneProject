package com.ns.oops;

public class CompositionMain {

	private String make;
	private String model;
	private static Composition compo;

	public CompositionMain(String make, String model, Composition compo) {
		super();
		this.make = make;
		this.model = model;
		this.compo = compo;
	}
	
	public void start() {
		System.out.println("car" + " "+ make + " " + model + " is starting");
	}

	public static void main(String[] args) {
		Composition c  = new Composition("V9");
		CompositionMain cm = new CompositionMain("ford","Mustag", compo);
		
		cm.start();
	}
}
