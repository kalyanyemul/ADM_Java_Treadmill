package com;

//Example 01 and 02  -- level 1
public class BulbUser {

//	 instance variables
	int watts;
	private boolean status = false;

//	 constructor defined
	BulbUser() {
		System.out.println("A bulb has been created");
	}
	
//	single argument constructor
	BulbUser(int wat) {
		this.watts = wat;
		System.out.println("A bulb has been created with Watts : " + this.watts);
	}

//	 instance methods
	void switchOn() {
		status = true;
	}

	void switchOff() {
		status = false;
	}

	void bulbDetails() {
		System.out.println("Bulb Wattage: " + watts);
		if (status)
			System.out.println("Bulb is On.");
		else
			System.out.println("Bulb is Off.");
	}

}



/**
 * ---------------------------
 *  Check Your Understanding 
 * ---------------------------
 * 
 * a)	In the above example a class named BulbUser is defined with instance variables watts and status. 
 * 		The variable status can be accessed within class BulbUser only because it is private thus providing data hiding.
 * 
 * b)	A constructor is also defined with a simple output statement.
 * 
 * c)	The name of the constructor is same as the name of 	<BulbUser> ..
 * 
 * 
 * 
 * 
 * 
 * ---------------------------
 *  Check Your Understanding   - Example 2 
 * ---------------------------
 * 
 * a)	Identify the two classes and variables declared in this example. 
 * -> the class name is = BulbUser  and variables are 1) watts 2) status 
 * 
 * b)	A constructor is also defined which takes <wat> parameter and assigns the value to the instance variable <watts>
 * 
 * c)	An object of class BulbUser is defined in class <main> and value <120> is passed as argument
 * 
 * 
 * this keyword -> this keyword refers to the current running object in the method ya constructor
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * ---------------------------
 *  Check Your Understanding   - Example 3  -- level 2 
 * ---------------------------
 * 
 * 
 * a)	Now, can you create a class, declare variables and initialize them.
 * 
 * b)	Can you now define the constructor of the class and initialize class variables.
 * 
 * c)	An object of class BulbUser is defined in class <Main> without any argument. 
 * 		This will invoke a call to a constructor without a parameter which is not defined
 * 
 * 
 */



