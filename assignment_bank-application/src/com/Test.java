package com;

public class Test {
	public static void main(String[] args) {
		Customer cust = new Bank();
		BankEmployee bnEmp = new Bank();
		Manager mgr = new Bank();
		
		Email msg = new Notification();
		
		
		bnEmp.openAccount();
		msg.openAcc();
		
		msg.deposite(cust.deposite(28000.50));
		msg.withdraw(cust.withdraw(14000.20));
		
		bnEmp.closeAccount();
		msg.closeAcc();
		
	}
}
