package com.ns.javamulthithreading;

class ThreadTest extends Thread {
	public void run() {
		for (int i = 0; i <= 50; i++) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " = " + i);
			
		}

	}
}

public class MyThread extends ThreadTest {

	public static void main(String[] args) throws InterruptedException {
		ThreadTest my = new ThreadTest();
		Thread t = new Thread(my);
		Thread t1 = new Thread(my);
		t.start();
		t.join();
		t1.start();

	}

}
