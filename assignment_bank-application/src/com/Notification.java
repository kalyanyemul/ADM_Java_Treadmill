package com;

public class Notification implements Email{

	public void deposite(double amt) {
		// TODO Auto-generated method stub
		System.out.println("Your account number ending with xxxxx is Credited " + amt + " amount.");
		
	}

	public void withdraw(double amt) {
		// TODO Auto-generated method stub
		System.out.println("Your account number ending with xxxxx is withdrawn " + amt + " amount. And Available balance is XXXXX");
	}

	public void openAcc() {
		// TODO Auto-generated method stub
		System.out.println("Your Account Created successfully. Your account number is XXXXXXXXXXXX");
	}

	public void closeAcc() {
		// TODO Auto-generated method stub
		System.out.println("Your account Closed");
	}

}
