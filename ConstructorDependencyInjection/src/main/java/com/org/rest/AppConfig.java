package com.org.rest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public StudentDetails studentDetails() {
		return new StudentDetails(1,"Aditya","Physics","Jharkhand");
	}
	
	@Bean(name= {"institute","dependencyInjection"})
	public CoachingInstitute coachingInstitute() {
		 return new CoachingInstitute(12000,30000,6000,studentDetails());
	}

}
