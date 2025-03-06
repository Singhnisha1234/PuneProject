package com.ns.overloading;

import java.io.FileNotFoundException;

public class Overriding2 extends Overriding1 {

	public int task(int a,int b) throws ClassCastException{
		return a*b;
	}
}
