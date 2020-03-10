package com.spring;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
	
	public HappyFortuneService() {
		System.out.println(">> Dentro do construtor de HappyFortuneService");
	}

	@Override
	public String getFortune() {
		return "Today is your lucky day!!!";
	}

}
