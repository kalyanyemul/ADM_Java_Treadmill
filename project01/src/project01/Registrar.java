package project01;

public class Registrar {

	private Registrar() {
	}

//	methods
	static Registrar getRegistrar() {
		return new Registrar();
	}

	String registerStudent(Student student) {
		Validator validator = Validator.getValidator();
		if (validator.validateStudentDetails(student)) {
			return "admissionId";
		}
		return "true";
	}
}
