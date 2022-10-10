package com.Examination;

import com.university.Student;

public class ExamRegistrar {
	private static ExamRegistrar examRegistrar;

	private ExamRegistrar() {
		
	}

	public static ExamRegistrar getExamRegistar() {
		if (examRegistrar == null) {
			examRegistrar = new ExamRegistrar();
			return examRegistrar;
		}
		return examRegistrar;
	}

	public Exam registeringStudentForExamination(Student student) {
		Paper paper = new Paper();
		Exam exam = new Exam(paper);
		return exam;
	}
}
