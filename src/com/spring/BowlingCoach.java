package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BowlingCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Practice your bowling skills!!!";
	}

	@Override
	public String getFortune() {
		return "Bowling!: " + fortuneService.getFortune();
	}

	@Autowired
	@Qualifier("happyFortuneService")
	public void setFortuneService(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
}
