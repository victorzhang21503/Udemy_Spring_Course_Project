package com.luv2code.springdemo;

import org.springframework.messaging.handler.invocation.ReactiveReturnValueHandler;

public class BaseballCoach implements Coach{
	private FortuneService fortuneService;

	public BaseballCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
	
	public BaseballCoach() {}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	
}
