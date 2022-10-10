package com;

public class Person {

	private String firstName;
	private String lastName;

	// Constructor for initializing first and last names.
	Person() {
		this.firstName = "DefaultName";
		this.lastName = "DefaultName";
	}

	// Overload method Person for last name parameter.
	Person(String lname) {
		this.firstName = "Defaultname";
		this.lastName = lname;
	}

	// Overload method Person for first and last name parameter.
	Person(String fname, String lname) {
		this.firstName = fname;
		this.lastName = lname;
	}

//	display
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	/**
	 * a) A constructor is defined which takes no parameter and assigns the value of the instance variables to null (see line no. 6 to 9). 
	 * -> it is a empty constructor
	 * 
	 * b) A constructor is defined which takes one parameter and assigns the value of lastName with the value passed (see line no. 17 to 21). 
	 * -> Single string passing argument constructor
	 * 
	 * c) A constructor is defined which takes two parameter and assigns the value of the instance variables with the values passed (see line no. 6 to 9).
	 * -> Two string passing argument constructor
	 *  
	 * d) Construtors having same name but differ in the number and/or order of parameters demonstrate the concept of <Parameterized constructor>
	 *
	 */
	

}
