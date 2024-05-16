package engineer;

import org.springframework.stereotype.Component;

@Component
public class Civil implements College{
	
	public void study()
	{
		System.out.println("I am a civil engineer");
	}

}
