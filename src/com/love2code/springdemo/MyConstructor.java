package com.love2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyConstructor {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("myTrackCoach"
				+ "", Coach.class);
		theCoach.getDailyWorkout();
		System.out.println(theCoach.getDailyFortune());
		context.close();
	}

}
