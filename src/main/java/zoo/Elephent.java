package zoo;

import org.springframework.stereotype.Component;

@Component
public class Elephent implements Animal{
	@Override
	public void sound() {
		System.out.println("This is elephent sound");
		
	}

}
