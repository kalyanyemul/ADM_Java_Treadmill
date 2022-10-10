package com.Registration;

import com.university.Student;

public class Validator {
	
	private static Validator validator;

	private Validator() {
	}

	public static Validator getValidator() {
		if (validator == null) {
			validator = new Validator();
			return validator;
		}
		return validator;
	}

	public boolean validateStudentDetails(Student student) {
		if (student.getAge() <= 18 || student.getAge() >= 50) {
			return false;
		}
		System.out.println("THIS STUDENT VALIDATED");
		return true;
	}
}
