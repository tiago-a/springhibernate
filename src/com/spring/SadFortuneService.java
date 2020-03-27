package com.spring;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Unlucky day! eh!?";
	}

}
