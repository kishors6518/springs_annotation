package engineer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engineer {
	@Value("Aditya")
	String name;
	
	@Value("8956231478")
	double phone;
	
	@Value("Latur")
	String address;
	
	@Autowired
	@Qualifier("civil")
	College c;
	
	public void branch()
	{
		c.study();
	}
	

}
