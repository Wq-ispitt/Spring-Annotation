package com.anno.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.anno.spring")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	//define method to expose bean
	@Bean
	public FortuneService sadFortuneServ() {
		return new SadFortuneServ();
	}
	
	//creates an instance of SwimCoach, calling the method sadFortuneServ; 
	//@Bean will intercept and return a singleton instance of sadFortuneServ, then its injected into swim coach instance.
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneServ());
	}
}
