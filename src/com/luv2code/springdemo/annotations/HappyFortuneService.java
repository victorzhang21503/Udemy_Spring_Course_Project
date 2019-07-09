package com.luv2code.springdemo.annotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
	public HappyFortuneService() {
		System.out.println(">> HappyFortuneService: inside happy fortune service constructor");
	}
	@Override
	public String getFortune() {
		
		return "Today is your lucky day!";
	}

}
