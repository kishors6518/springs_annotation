package is_a_relationship;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(ItemConfig.class);
		Computer c=context.getBean("computer",Computer.class);
		c.used();
		
		Item i=context.getBean("pen",Pen.class);   //Upcasting
		i.used();
		
		System.out.println(((Pen)i).cost);
		
		
		Bike b=context.getBean("bike",Bike.class);
		b.used();

	}

}
