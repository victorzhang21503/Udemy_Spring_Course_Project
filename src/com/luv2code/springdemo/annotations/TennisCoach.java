package com.luv2code.springdemo.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	// define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		
		System.out.println(">> TennisCoach: inside of doMyStartupStuff()");
	}
	
	// define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("TennisCoach email is: " + email);
		System.out.println("TennisCoach team is: " + team);
		System.out.println(">> TennisCoach: inside of doMyCleanupStuff()");
	}

	public TennisCoach() {
		
		System.out.println(">> TennisCoach: inside default constructor");
		
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
