package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private myFortuneService fortuneService;
	
	//add new fields for email
	private String email;
	private String team;
	
	public String getEmail() {
		return email;
	}
	public String getTeam() {
		return team;
	}
	public void setEmail(String email) {
		this.email = email;
		System.out.println("settermethod - akourtis@hauniv.edu " + email);
	}
	public void setTeam(String team) {
		this.team = team;
		System.out.println("settermethod - Javacoders" + team);
	}
	public CricketCoach(){
		System.out.println("CricketCoach: inseide a no-arg constructor");
	}
	// setter method
	public void setFortuneService(myFortuneService fortuneService) {
		System.out.println("CricketCoach: inseide setter method: setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
