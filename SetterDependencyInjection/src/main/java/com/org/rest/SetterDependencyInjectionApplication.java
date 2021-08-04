package com.org.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SetterDependencyInjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SetterDependencyInjectionApplication.class, args);
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		CoachingInstitute coachingInstitute = (CoachingInstitute) context.getBean("coachingInstitute");
		
		
		System.out.println("=============CoachingInstitute==================");
		System.out.println(" Fees        "+coachingInstitute.getFees());
		System.out.println(" Maintenance "+coachingInstitute.getMaintenance());
		System.out.println(" Slary       "+coachingInstitute.getSalary());
		
		System.out.println("==============StudentDetails=====================");
		System.out.println(" RollNo       "+coachingInstitute.getStudentDetails().getRollNo());
		System.out.println(" Name         "+coachingInstitute.getStudentDetails().getName());
		System.out.println(" Subject      "+coachingInstitute.getStudentDetails().getSubject());
		System.out.println(" Address      "+coachingInstitute.getStudentDetails().getAddress());
	}

}
