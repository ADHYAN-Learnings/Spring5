package com.org.rest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public StudentDetails studentDetails() {
		StudentDetails studentDetails = new StudentDetails();
		
		studentDetails.setRollNo(1);
		studentDetails.setName("Aditya");
		studentDetails.setSubject("Physics");
		studentDetails.setAddress("Jharkhand");
		
		return studentDetails;
	}

	@Bean
	public CoachingInstitute coachingInstitute() {
		
		CoachingInstitute coachingInstitute = new CoachingInstitute();
		
		coachingInstitute.setFees(25000);
		coachingInstitute.setMaintenance(5000);
		coachingInstitute.setSalary(10000);
		coachingInstitute.setStudentDetails(studentDetails());
		
		return coachingInstitute;
	}
}
