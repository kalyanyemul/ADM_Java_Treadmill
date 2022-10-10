package com;

//BulbUser 5 Example -- level 3
public class BulbUser_5E {

	// instance variables
	int watts;
	private boolean status = false;

	// constructor with no parameter
	BulbUser_5E() {
		this(60); // it calls default constructor
		System.out.println("Constructor with no paramater");
	}

	// constructor with a parameter
	BulbUser_5E(int watts) {
		this.watts = watts;
		System.out.println("Constructor with one paramater");
	}

	// instance methods
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
 * a) How many constructors do we have here? ( see line no. 6, 11) 
 * ->  2
 * 
 * b) First constructor takes no parameter and the other takes <integer parameter> It initializes a class variable using keyword <this> (see line no. 12) 
 * 
 * c) The class is instantiated in class Main with constructor having no parameters. Can you identify how the variable is initialized and method is
 * invoked. (see line no. 34, 35)
 * -> using instance variable <int watts>
 */
