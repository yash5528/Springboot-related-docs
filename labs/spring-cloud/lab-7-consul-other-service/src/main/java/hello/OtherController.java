package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OtherController {

	@Autowired
	RestTemplate restTemplate;
	
	 @RequestMapping("/")
	    public String disp()
	    {
		    System.out.println("done###################");
	    	return  restTemplate.getForObject("http://simple-microservice", String.class);
	    }
}
