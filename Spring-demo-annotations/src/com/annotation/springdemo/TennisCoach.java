package com.annotation.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println(">> Tennis Coach: inside default Constructor");
	}
	/*
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		System.out.println("Inside TennisCoach Constructor");
		this.fortuneService = fortuneService;
	}
	*/
	
//	@Autowired
//	public void doSomeCrazyStuff(FortuneService fortuneService) {
//		System.out.println(">> Tennis Coach: inside doSomeCrazyStuff() method");
//		this.fortuneService = fortuneService;
//	}

	//define init method
	@PostConstruct
	public void doMyStartupSide() {
		System.out.println(">>Tennis Coach : inside of doMyStartupStuff()");
	}
	
	//define my destroy method

	@PreDestroy

	public void doMyCleanUpMethod()
	{
	System.out.println(">>Tennis Coach Method - inside doMyCleanUpMethod");
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your BackHand Volley";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

	
}
