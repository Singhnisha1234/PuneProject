package com.ns.javamulthithreading;

public class SynchronisedClass extends Thread {

	public static synchronized void pune() {

		for (int i = 0; i <= 2; i++) {
			System.out.println("Good morning Pune");
		}
	}

	public static synchronized void gwalior() {
		for (int i = 0; i <= 2; i++) {
			System.out.println("Good morning Gwalior");
		}
	}

	public void noida() {
		for (int i = 0; i <= 2; i++) {
			System.out.println("Good morning Noida");
		}
	}

	public void run() {
		pune();
		gwalior();
		noida();
	}

	public static void main(String[] args) {
		SynchronisedClass sc = new SynchronisedClass();
		Thread t = new Thread(sc);
		Thread t1 = new Thread(sc);
		t.start();
		t1.start();
	}

}
