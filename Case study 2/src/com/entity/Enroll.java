package com.entity;

import java.time.LocalDate;

public class Enroll {
	private Student student;
	private Course course;
	private String enrollmentDate;
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public String getEnrollmentDate() {
		return enrollmentDate;
	}
	public void setEnrollmentDate(String enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}
	public Enroll(Student student, Course course, String string) {
		super();
		this.student = student;
		this.course = course;
		this.enrollmentDate = string;
	}
	
}
