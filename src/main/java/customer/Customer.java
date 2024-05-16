package customer;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Customer {
	
	@PostConstruct
	public void start() {
		System.out.println("Go to market");
	}
	public void shop() {
		System.out.println("I am shopping glossary");
		
	}
	@PreDestroy
	public void stop() {
		System.out.println("Come back home");
	}
}
