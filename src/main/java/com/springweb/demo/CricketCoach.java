package com.springweb.demo;

public class CricketCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;

	private String email;
	private String teamName;

	// define a setter for dependency injection of literals

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getEmail() {
		return email;
	}

	public String getTeamName() {
		return teamName;
	}

	@Override
	public String getDailyWorkout() {
		return "Let's have a T20I match";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

	// define a setter for dependency injection
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
}








