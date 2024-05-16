package employee;

import org.springframework.stereotype.Component;

@Component
public class HDFC implements BankAccount{
	@Override
	public void balance() {
		System.out.println("5000");
		
	}

}
