package com.ns.javamulthithreading;

public class BankATM {

	int balance = 5000;

	public synchronized void deposit(int amount) {
		balance = balance + amount;
		System.out.println(Thread.currentThread().getName() + " deposit = " + amount + " new balance =" + balance);
	}

	public synchronized void withdraw(int amount) {
		if (balance > amount) {
            balance = balance - amount;
            System.out.println(Thread.currentThread().getName() + " withdraw = " + amount + " new balance =" + balance);
		}else {
			System.out.println(Thread.currentThread().getName() + " insufficient balance "  );
		}
	}
	
	public synchronized int getBalance() {
		return balance;
	}
	

}
