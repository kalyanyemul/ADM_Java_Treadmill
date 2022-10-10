package com.Registration;

import com.university.Student;

public class Registrar {
	private static Registrar registrar;
	
	private Registrar() {

	}
	
	public static Registrar getRegistrar() {
		if(registrar==null) {
			registrar = new Registrar();
			return registrar;
		}
		return registrar;
	}
	
	public String registrarStudent(Student student) {
		String admissionId = null;
		Validator validator = Validator.getValidator();
			if(validator.validateStudentDetails(student)) {
				admissionId = "AAABBB000001";
			}
			return admissionId;
	}
}
