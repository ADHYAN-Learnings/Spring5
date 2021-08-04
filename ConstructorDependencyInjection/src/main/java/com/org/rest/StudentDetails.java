package com.org.rest;

public class StudentDetails {
	
	private int rollNo;
	private String name;
	private String subject;
	private String addres;
	
	public StudentDetails(int rollNo, String name, String subject, String addres) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.subject = subject;
		this.addres = addres;
	}

	@Override
	public String toString() {
		return "StudentDetails [rollNo=" + rollNo + ", name=" + name + ", subject=" + subject + ", addres=" + addres
				+ "]";
	}
	
}
