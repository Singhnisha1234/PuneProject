package com.ns.javamulthithreading;

class Thread1 extends Thread {

	ObjectLeveLock object = null;

	Thread1(ObjectLeveLock object) {
		this.object = object;
	}


	public void run() {
		object.m1();
		object.m2();
	}

}