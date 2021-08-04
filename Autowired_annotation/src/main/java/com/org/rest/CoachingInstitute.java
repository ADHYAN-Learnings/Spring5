package com.org.rest;

import org.springframework.stereotype.Component;

@Component
public class CoachingInstitute {
	
	private int salary;
	private int fees;
	private int maintenance;
	private StudentDetails studentDetails;
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public int getMaintenance() {
		return maintenance;
	}
	public void setMaintenance(int maintenance) {
		this.maintenance = maintenance;
	}
	public StudentDetails getStudentDetails() {
		return studentDetails;
	}
	public void setStudentDetails(StudentDetails studentDetails) {
		this.studentDetails = studentDetails;
	}
	@Override
	public String toString() {
		return "CoachingDetails [salary=" + salary + ", fees=" + fees + ", maintenance=" + maintenance + "]";
	}
}
