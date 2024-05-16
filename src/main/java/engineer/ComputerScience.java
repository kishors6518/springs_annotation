package engineer;

import org.springframework.stereotype.Component;

@Component
public class ComputerScience implements College{
	
	public void study() {
		
		System.out.println("I am a computer science student");
	}

}
