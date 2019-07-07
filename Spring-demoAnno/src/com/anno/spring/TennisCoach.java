package com.anno.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//default bean id
@Component
public class TennisCoach implements Coach {
	
//	public TennisCoach() {
//		System.out.println(">> Tennis Coach, inside default constructor");
//	}
	//init method
	@PostConstruct
	public void MyStartStuff() {
		System.out.println(">> Tennis Coach, inside MyStartStuff()");
	}
	//destroy method
	@PreDestroy
	public void MyDestroy() {
		System.out.println(">> Tennis Coach, inside MyDestroy()");
	}
	
	//field injection
	/*
	@Autowired
	@Qualifier("randomFortServ")
	*/
	private FortuneService fort;
	
	
	/* constructor injection
	//Spring will scan for a component that implements FortuneService interface
	@Autowired
	public TennisCoach(FortuneService fortune) {
		fort = fortune;
	}
	*/
	
	@Autowired
	public TennisCoach(@Qualifier("randomFortServ") FortuneService theFort) {
		System.out.println("inside tennis coach constructor.");
		System.out.println("use qualifier inside constructor");
		fort = theFort;
	}
	/*
	//setter method
	@Autowired
	public void setFortuneService(FortuneService theFort) {
		System.out.println("inside setfort method.");
		fort = theFort;
		
	}
	*/

	@Override
	public String getDailyWorkout() {
		
		return "Call getDailyWorkout, TennisCoach bean class.";
	}

	@Override
	public String getDailyFortune() {
		
		return fort.getFortune();
	}
	
	

}
