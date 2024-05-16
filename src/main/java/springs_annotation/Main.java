package springs_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(Config.class);
		Product p=ac.getBean("product",Product.class);
//		p.description();
//		System.out.println(p.getName());
//		System.out.println(p.getPrice());
		System.out.println(p);
		
		Product p2=ac.getBean("product",Product.class);
		System.out.println(p2);
		
		
	}

}
