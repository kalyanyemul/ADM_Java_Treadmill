package com.university;

import java.time.LocalDate;

import com.Examination.Exam;

public class Student {
	private String name ;
	private String maritalStatus;
	private int age;
	private String sex;
	private LocalDate dateofBirth; 
	private String address;
	private String primaryEmailId;
	private String secondaryEmailId;
	private int id;
	private long phoneNumber;
	private String highestEducationQualification;
	private String nationality;
	
	private String admissionID;
	private String result;
	private Exam exam;
	
	
	

	public Student(String name, String maritalStatus, int age, String sex, LocalDate dateofBirth, String address,
			String primaryEmailId, String secondaryEmailId, int id, long phoneNumber,
			String highestEducationQualification, String nationality) {
		super();
		this.name = name;
		this.maritalStatus = maritalStatus;
		this.age = age;
		this.sex = sex;
		this.dateofBirth = dateofBirth;
		this.address = address;
		this.primaryEmailId = primaryEmailId;
		this.secondaryEmailId = secondaryEmailId;
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.highestEducationQualification = highestEducationQualification;
		this.nationality = nationality;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public LocalDate getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(LocalDate dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPrimaryEmailId() {
		return primaryEmailId;
	}

	public void setPrimaryEmailId(String primaryEmailId) {
		this.primaryEmailId = primaryEmailId;
	}

	public String getSecondaryEmailId() {
		return secondaryEmailId;
	}

	public void setSecondaryEmailId(String secondaryEmailId) {
		this.secondaryEmailId = secondaryEmailId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getHighestEducationQualification() {
		return highestEducationQualification;
	}

	public void setHighestEducationQualification(String highestEducationQualification) {
		this.highestEducationQualification = highestEducationQualification;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	
	
	
	
}
