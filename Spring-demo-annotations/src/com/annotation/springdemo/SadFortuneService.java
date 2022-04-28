package com.annotation.springdemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Today is a Sad Day";
	}

}
