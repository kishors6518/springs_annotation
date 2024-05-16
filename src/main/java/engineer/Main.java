package engineer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(StudentConfig.class);
		College c=context.getBean("mechanical",Mechanical.class);
		College c1=context.getBean("civil",Civil.class);
		Engineer e=context.getBean("engineer",Engineer.class);
		e.branch();
		
	}

}
