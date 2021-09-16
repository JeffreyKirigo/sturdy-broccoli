package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
   //Default constructor
	public CricketCoach() {
		System.out.println("CricketCoach: Inside the no-arg constructor");
	}
		
	//Setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside our setter injection method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	//Setter injection methods for literal values
	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside set Email Address");
		this.emailAddress = emailAddress;
	}
	
	@Override
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("Inside set Team method");
		this.team = team;
	}
	
	public String getTeam() {
		return team;
	}


	// Daily work out
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}
	
	//Daily fortune Service
	@Override
	public String getDailyFortune() {
		return "In cricket coach: "+ fortuneService.getFortune();
	}

}
