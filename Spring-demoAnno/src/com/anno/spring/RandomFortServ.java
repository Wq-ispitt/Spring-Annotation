package com.anno.spring;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortServ implements FortuneService {
	
	private String[] data = {
			"hello",
			"thank you",
			"next"
	};
	private Random myRandom = new Random();
	

	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		
		String theFort = data[index];
		return theFort;
	}

}
