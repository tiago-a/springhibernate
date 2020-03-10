package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PingPongCoach implements Coach {
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	public PingPongCoach() {
		System.out.println(">> Dentro do construtor de PingPongCoach!");
	}

	@Override
	public String getDailyWorkout() {
		return "Have some fun practing!";
	}

	@Override
	public String getFortune() {
		return "Ping Pong! >> " + fortuneService.getFortune();
	}

}
