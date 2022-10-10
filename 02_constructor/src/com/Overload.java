package com;

public class Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person(); // it calling to empty constructor - (1)
		System.out.println("Person_1 output is " + p1.getFirstName() + " " + p1.getLastName());

		Person p2 = new Person("Yemul"); // it calling to single argument constructor - (2)
		System.out.println("Person_2 output is " + p2.getFirstName() + " " + p2.getLastName());

		Person p3 = new Person("Kalyan", "Yemul"); // it calling to two string passing constructor - (3)
		System.out.println("Person_3 output is " + p3.getFirstName() + " " + p3.getLastName());
	}

	/**
	 * --------------------------- 
	 * 		OUTPUT 	- Example 4
	 * ---------------------------
	 * 
	 * 
	 * Person_1 output is DefaultName DefaultName
	 * Person_2 output is Defaultname Kalyan 
	 * Person_3 output is Kalyan Yemul
	 */

}
