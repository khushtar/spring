package com.springweb.demo;


public class BaseballCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;

	// define a constructor for dependency injection
	BaseballCoach(FortuneService fortuneService){
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

}








