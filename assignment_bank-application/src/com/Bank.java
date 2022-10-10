package com;

public class Bank implements Customer, BankEmployee, Manager {
	@Override
	public void netBanking() {
		// TODO Auto-generated method stub
		System.out.println("Net credentials provided");
	}
	@Override
	public void openAccount() {
		// TODO Auto-generated method stub
		System.out.println("Account opening under progress");
	}
	@Override
	public void closeAccount() {
		// TODO Auto-generated method stub
		System.out.println("Account closing under progress");
	}
	@Override
	public Double deposite(double amount) {
		// TODO Auto-generated method stub
		return amount;
	}
	@Override
	public Double withdraw(double amount) {
		// TODO Auto-generated method stub
		return amount;
	}
	
}
