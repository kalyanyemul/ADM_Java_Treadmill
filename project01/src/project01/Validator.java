package project01;

//import project01.Student;

public class Validator {

	Student student;

	private Validator() {

	}

//	methods
	static Validator getValidator() {
		return new Validator();

	}

	boolean validateStudentDetails(Student student){
		System.out.println("Validated");
		return true;
	}

}
