package com.org.rest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

@Configuration
public class AppConfig {
	
	@Autowired
	CoachingInstitute coachingInstitute;
	
	@Autowired
	StudentDetails studentDetails;
	
	
	@Bean
	public StudentDetails studentInfo() {
		
		studentDetails.setRollNo(1);
		studentDetails.setName("Aditya");
		studentDetails.setSubject("Physics");
		studentDetails.setAddress("Jharkhand");
		
		return studentDetails;
	}
	
	
	@Bean
	public CoachingInstitute coachingInfo() {
		
		coachingInstitute.setFees(25000);
		coachingInstitute.setSalary(10000);
		coachingInstitute.setMaintenance(5000);
		coachingInstitute.setStudentDetails(studentInfo());
		
		return coachingInstitute;

     }

} 


