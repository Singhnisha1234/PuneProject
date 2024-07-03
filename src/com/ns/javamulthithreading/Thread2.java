package com.ns.javamulthithreading;

class Thread2 extends Thread{
	
	ObjectLeveLock object=null;
	Thread2(ObjectLeveLock object){
		this.object = object;
	}
	
	public void run() {
		
		object.m1();
		object.m2();
	}
}