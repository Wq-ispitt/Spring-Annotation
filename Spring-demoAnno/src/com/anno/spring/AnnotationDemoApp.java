package com.anno.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		//read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//get the bean from container
		//default bead id, same name of the class, but first letter lowercase
	    Coach theCoach = context.getBean("tennisCoach", Coach.class);
	    
	    Coach swimCoach = context.getBean("swimCoach", Coach.class);
	    
		//call method on the bean
	    System.out.println(theCoach.getDailyWorkout());
	    
	    //call dailyFortune method, dependency injection!
	    System.out.println(theCoach.getDailyFortune());
	    
	    System.out.println(swimCoach.getDailyFortune());
	    
		
		//close the context
	    context.close();

	}

}
