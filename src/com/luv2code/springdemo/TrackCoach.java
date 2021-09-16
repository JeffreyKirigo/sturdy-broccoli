 package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public TrackCoach() {
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		
		//use my fortuneService to get a fortune
		return "Just Do It: "+ fortuneService.getFortune();
	}

	@Override
	public String getEmailAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTeam() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//add an init method
	public void doMyStartupStuff() {
		System.out.println("Track Coach: inside method doMyStartupStuff");
	}
	//add a destroy method
	public void doMyCleanUpStuffYoyo() {
		System.out.println("Track Coach: inside method doMyCleanUpStuff");
	}

}
