package com.ns.javamulthithreading;

public class SBIBank {

	public static void main(String[] args) {

		BankATM bank = new BankATM();
		Thread t = new Thread(new BankTransaction(bank));
		Thread t1 = new Thread(new BankTransaction(bank));
		
		t.start();
		t1.start();
	}

}
