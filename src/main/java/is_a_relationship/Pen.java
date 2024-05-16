package is_a_relationship;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pen implements Item{
	@Value("20")
	double cost;
	
	@Override
	public void used() {
		System.out.println("Pen used for writting");
		
	}
	

}
