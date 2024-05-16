package springs_annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Product {
	@Value("Cycle")
	private String name;
	@Value("50000")
	private double price;
	
	public void description() {
		System.out.println("I am from description()");
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}

}
