package com.org.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Autowired_annotation {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context =	SpringApplication.run(Autowired_annotation.class, args);
		

		
		CoachingInstitute coachingInstitute = context.getBean("coachingInfo",CoachingInstitute.class);
		
		 System.out.println(":::::::::::::::CoachingDetails:::::::::::::::::: ");
		 System.out.println("Fees         "+coachingInstitute.getFees());
		 System.out.println("Maintenance  "+coachingInstitute.getMaintenance());
		 System.out.println("Salary       "+coachingInstitute.getSalary());
		 
		 
		 System.out.println(":::::::::::::::CoachingDetails <------------- StudentDetails:::::::::::::::::: ");
		 System.out.println(" RollNo     "+coachingInstitute.getStudentDetails().getRollNo());
		 System.out.println(" Name       "+coachingInstitute.getStudentDetails().getName());
		 System.out.println(" Subject    "+coachingInstitute.getStudentDetails().getSubject());
		 System.out.println(" Address    "+coachingInstitute.getStudentDetails().getAddress()); 
	}
	
}
