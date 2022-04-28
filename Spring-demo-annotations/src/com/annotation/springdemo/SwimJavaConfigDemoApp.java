package com.annotation.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		
		//read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the bean from spring container
		
		SwimCoach theCoach = context.getBean("swimCoach",SwimCoach.class);
		
		//call a method on the bean
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getFortune());
		
		System.out.println("email: "+ theCoach.getEmail());
		System.out.println("team: " + theCoach.getTeam());
		
		//close the context
		context.close();
	}

}
