package com.org.rest;

public class StudentDetails {
	
	private int rollNo;
	private String name;
	private String subject;
	private String address;
	
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "StudentDetails [rollNo=" + rollNo + ", name=" + name + ", subject=" + subject + ", address=" + address
				+ "]";
	}
}
