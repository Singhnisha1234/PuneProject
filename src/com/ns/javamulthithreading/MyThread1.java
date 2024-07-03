package com.ns.javamulthithreading;

public class MyThread1 implements Runnable {

	@Override
	public void run() {
		
		for(int i = 0; i<=3 ; i++) {
			System.out.println("run method");
		}
	}
	public static void main(String[] args) {
		MyThread1 m = new MyThread1();
		Thread t = new Thread(m);
		t.start();
	}

}
