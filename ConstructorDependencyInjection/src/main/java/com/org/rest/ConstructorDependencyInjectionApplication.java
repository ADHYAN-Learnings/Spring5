package com.org.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ConstructorDependencyInjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConstructorDependencyInjectionApplication.class, args);
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		CoachingInstitute coaching = (CoachingInstitute)context.getBean("dependencyInjection");
		
		coaching.display();
	}

}
