package engineer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Mechanical implements College{
	
	public void study()
	{
		System.out.println("I am a mechanical student");
	}

}
