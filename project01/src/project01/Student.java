package project01;

public class Student {
	private String name;
	private boolean maritalStatus;
	private String gender;
	private String DOB;
	private String address;
	private String privateEmailId;
	private String secondaryEmailId;
	private String phoneNo;
	private String highestQualify;
	private String nationality;

	private String admissionId;
	
	private String result;
	
	private Exam exam;
	
	
	public Student(String name, boolean maritalStatus, String gender, String dOB, String address, String privateEmailId,
			String secondaryEmailId, String phoneNo, String highestQualify, String nationality, String admissionId,
			String result, Exam exam) {
		super();
		this.name = name;
		this.maritalStatus = maritalStatus;
		this.gender = gender;
		DOB = dOB;
		this.address = address;
		this.privateEmailId = privateEmailId;
		this.secondaryEmailId = secondaryEmailId;
		this.phoneNo = phoneNo;
		this.highestQualify = highestQualify;
		this.nationality = nationality;
		this.admissionId = admissionId;
		this.result = result;
		this.exam = exam;
	}

	
	
	
//	methods
	void registerStudent(){
		Registrar registrar = Registrar.getRegistrar();
		admissionId = registrar.registerStudent(this);
	}
	void registerForExam(){
		ExamRegistrar examRegistrar = ExamRegistrar.getExamRegistrar();
		exam = examRegistrar.registeringStudentForExamination(this);
	}
	void appearForExam(){
		Paper paper = exam.getPaper();
		result = paper.submit();
	}

}
