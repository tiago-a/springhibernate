package com.spring;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;

	public SwimCoach(FortuneService theFortuneService) {
		System.out.println(">> Inside SwinCoach constructor");
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swin a lot!!!";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

}
