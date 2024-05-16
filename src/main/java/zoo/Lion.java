package zoo;

import org.springframework.stereotype.Component;

@Component
public class Lion implements Animal{
	@Override
	public void sound() {
		System.out.println("It is lion sound");
		
	}

}
