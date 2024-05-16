package zoo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		Animal a=context.getBean("donkey",Donkey.class);
		Animal a2=context.getBean("lion",Lion.class);
		Zoo zoo=context.getBean("zoo",Zoo.class);
		zoo.cage();

	}

}
