package com.luv2code.springdemo;

import org.springframework.dao.IncorrectResultSizeDataAccessException;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "run 3 miles every day";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	// add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	// add a destroy method 
	public void doMyCleanupStuffYoYo() {
		System.out.println("inside method doMyCleanupStuffYoYo");
	}
}
