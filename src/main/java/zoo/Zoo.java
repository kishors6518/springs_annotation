package zoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Zoo {
	@Value("Katraj zoo")
	String name;
	@Value("Rajath")
	String guide;
	
	@Autowired
	@Qualifier("lion")
	Animal a;
	 
	public void cage() {
		a.sound();
		
	}

}
