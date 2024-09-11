package com.ns.java8interface;

public class Demo {

	public static void main(String[] args) {
		
		Developer android = new AndroidDeveloper();
		Developer ios =	new IOSDeveloper();
		
		android.develop();
		ios.develop();
	}
}
