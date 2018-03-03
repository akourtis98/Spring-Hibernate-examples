package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private myFortuneService fortuneService;
	
	public TrackCoach(myFortuneService fortuneService){
		this.fortuneService = fortuneService;
	}
	
	public TrackCoach() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do it: " + fortuneService.getFortune();
	}
	// add an init method
	public void doMyStartupStuff(){
		System.out.println("TrackCoach: do my startup stuff");
	}
	
	//add destroy method
	public void doMyCleanUppStuff(){
		System.out.println("TrackCoach: do my clean stuff");
	}
}









