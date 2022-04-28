package com.annotation.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] data = {
			"Beware of wolf in sheep's clothing",
			"Diligence is the mother of good Luck",
			"The journey is the reward"
	};
	
	private Random myRandom = new Random();
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		return theFortune;
	}

}
