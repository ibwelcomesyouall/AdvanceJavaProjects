package com.indranil.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")
@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	// define a default constructor
	public TennisCoach() {
		System.out.println("TennisCoach: inside default constructor");
	}
	
	/*@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		System.out.println("TennisCoach: inside doSomeCrazyStuff() method");
		fortuneService = theFortuneService;
	}*/
	
	// define a setter method
	/*@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println("TennisCoach: inside setFortuneService() method");
		fortuneService = theFortuneService;
	}*/
	
	/*@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}*/
	
	// add an init method
	@PostConstruct
		public void doMyStartupStuff() {
			System.out.println("TennisCoach: inside method doMyStartupStuff");
		}
		
		// add a destroy method
	@PreDestroy
		public void doMyCleanupStuff() {
			System.out.println("TennisCoach: inside method doMyCleanupStuff");
		}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
