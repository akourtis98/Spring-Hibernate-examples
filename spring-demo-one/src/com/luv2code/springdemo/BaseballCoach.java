package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	//define a private field for the dependency
	private myFortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(myFortuneService thefortuneService){
		fortuneService = thefortuneService;
	}
	
	@Override
	public String getDailyWorkout(){
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		//use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}
}
