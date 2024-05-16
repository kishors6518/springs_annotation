package employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	String name;
	long phone;
	String address;
	
	@Autowired
	@Qualifier("ICICI")
	BankAccount account;
	
	public void check() {
		account.balance();
	}

}
