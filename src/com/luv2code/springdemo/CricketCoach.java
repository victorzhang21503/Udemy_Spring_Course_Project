package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	private String emailAddress;
	private String team;
	private FortuneService fortuneService;
	
	public void CricketCoach() {
		// TODO Auto-generated constructor stub
		System.out.println("Cricket Coach: inside no-arg constructor");
	}
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket Coach: inside the setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("Cricket Coach: inside the setter method - setTeam");
		this.team = team;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public FortuneService getFortuneService() {
		System.out.println("Cricket Coach: inside get method");
		return fortuneService;
	}



	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket Coach: inside set method");
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes" ;

	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
