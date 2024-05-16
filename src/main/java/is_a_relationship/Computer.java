package is_a_relationship;

import org.springframework.stereotype.Component;

@Component
public class Computer implements Item{
	
	@Override
	public void used() {
		// TODO Auto-generated method stub
		System.out.println("Computer used for exploring");
		
	}

}
