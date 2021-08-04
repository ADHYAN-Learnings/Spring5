package com.org.rest;

public class CoachingInstitute {

	private int salary;
	private int fees;
	
	private int maintenance;
	
	private StudentDetails studentDetails;

	public CoachingInstitute(int salary, int fees, int maintenance,StudentDetails studentDetails ) {
		super();
		this.salary = salary;
		this.fees = fees;
		this.maintenance = maintenance;
		this.studentDetails = studentDetails;
	}
	
	public void display() {
		System.out.println(salary+" : "+fees+"  : "+maintenance);
		
		System.out.println(studentDetails.toString());
	}
	
}
