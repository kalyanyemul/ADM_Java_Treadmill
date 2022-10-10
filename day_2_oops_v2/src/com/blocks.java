package com;

public class blocks {
//	blocks 
//	1. instance
//	2. static
//	................................................................
	int a = 10;
	static int b = 20;
	void display (){
		System.out.println("Good Morning i am from instance method");
	}
	static void screen(){
		System.out.println("good morming.. I am from static method");
	}
//	.................................................................
//	instance block
	{
		display();
		screen();
		System.out.println("I'm a Instance block" + (a+b));
	}
	
//	static blocks	
	static {
//		display();  // it can't access becz of static block only access static method and static variables
		screen();
		System.out.println("I'm a static block " + b);
	}
	
	
	public static void main(String[] args) {
		blocks temp = new blocks();
		System.out.println("Done");
	}
}
