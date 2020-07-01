package com.sooriya;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is ur lucky day";
	}

	public void sampleinitmethod()
	{
		System.out.println("Inside sample init method");
	}
	public void sampledestroymethod()
	{
		System.out.println("Inside sample destroy method");
	}
}
