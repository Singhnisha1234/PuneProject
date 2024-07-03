package com.ns.javamulthithreading;

public class BankTransaction implements Runnable{

	
	private BankATM bankAtm;
	
	
	public BankTransaction(BankATM bankAtm) {
		super();
		this.bankAtm = bankAtm;
	}


	@Override
	public void run() {
		
		bankAtm.deposit(1000);
		bankAtm.withdraw(5000);
}

}
