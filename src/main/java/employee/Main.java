package employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		BankAccount b=context.getBean("SBI",SBI.class);
		BankAccount b2=context.getBean("ICICI",ICICI.class);
		Employee e=context.getBean("employee",Employee.class);
		e.check();

	}

}
