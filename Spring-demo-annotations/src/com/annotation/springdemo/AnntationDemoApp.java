package com.annotation.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnntationDemoApp {

	public static void main(String[] args) {
		
		
		//read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
		
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		//call a method on the bean
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getFortune());
		
		//close the context
		context.close();
	}

}
