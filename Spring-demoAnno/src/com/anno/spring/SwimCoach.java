package com.anno.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {
	//properties injection
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	private FortuneService fort;
	
	public SwimCoach(FortuneService theFort) {
		fort = theFort;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Swim 500 meters routine";
	}

	@Override
	public String getDailyFortune() {
		
		//return "inject properties value :" + email + " " + team;
		return fort.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
	

}
