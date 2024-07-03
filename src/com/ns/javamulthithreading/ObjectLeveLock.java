package com.ns.javamulthithreading;

public class ObjectLeveLock {

	public static void main(String[] args) {

		ObjectLeveLock object = new ObjectLeveLock();
		//Thread1 t1 = new Thread1(object);
		//Thread2 t2 = new Thread2(object);
	}

	public synchronized void m1() {
		System.out.println("in method m1() and Thread name is " + Thread.currentThread().getName());

	}

	public synchronized void m2() {
		System.out.println("in method m2() and Thread name is " + Thread.currentThread().getName());

	}
}

