package com.sooriya;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice batting for daily 30 mins";
	}

	public void settingInitMethod()
	{
		System.out.println("Inside init method");
	}
	public void settingDestroyMethod()
	{
		System.out.println("Inside destroy method");
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
