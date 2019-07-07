package com.anno.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new  AnnotationConfigApplicationContext(SportConfig.class);
		
	    SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
	    
	    //Coach swimCoach = context.getBean("swimCoach", Coach.class);
	    
		//call method on the bean
	    System.out.println(theCoach.getDailyWorkout());
	    
	    //call dailyFortune method, dependency injection!
	    System.out.println(theCoach.getDailyFortune());
	    
	    System.out.println("email: " + theCoach.getEmail());
	    System.out.println("team: " + theCoach.getTeam());
	    
	    //System.out.println(swimCoach.getDailyFortune());
	    
		
		//close the context
	    context.close();

	}

}
