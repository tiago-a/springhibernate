package com.spring;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your passing skills!";
	}

	@Override
	public String getFortune() {
		return null;
	}

}
