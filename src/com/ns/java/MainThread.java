package com.ns.java;

public class MainThread {

    final Object obj = new Object();

    Runnable t1 = () -> {
        synchronized (obj) {
            for (int i = 1; i <= 20; i++) {
                if (i % 2 == 0) {
                    System.out.println("Even " + i);
                    
                }
            }
        }
    };

    Runnable t2 = () -> {
            for (int i = 1; i <= 20; i++) {
                if (i % 2 != 0) {
                    System.out.println("Odd " + i);
                    
                
            }
        }
    };

    public static void main(String[] args) {
        MainThread m1 = new MainThread();
        Thread th1 = new Thread(m1.t1);  // Pass the Runnable instance t1
        Thread th2 = new Thread(m1.t2);  // Pass the Runnable instance t2

        th1.start();
        th2.start();
    }
}
