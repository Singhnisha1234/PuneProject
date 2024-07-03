package com.ns.oops;

public class Composition {

	private String type;

	public Composition(String type) {
		super();
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void start() {
		System.out.println("Engine of type" + type + "is starting");
	}
	
	
}
