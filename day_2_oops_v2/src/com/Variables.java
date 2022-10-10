package com;

public class Variables {

//	variables :
//	1) Instance 
//	2) Static
//	3) Local
	
	static int s = 50;	//static
	int i = 100;		//instance
	
	void fun() {
		int b = 10;	//local
		System.out.println(s + " " + b);
		++s;
		++b;  //it not save for second calling of method, becz it destroy
	}
	
	
	public static void main(String[] args) {
	
		int a= 10; //local - it only access within main body
		
		Variables obj = new Variables();
		System.out.println(a);
		System.out.println(Variables.s);   // access without creating object of static variables
		System.out.println(obj.i);
		
		obj.fun();
		obj.fun();
		obj.fun();
		
		
	}
}
