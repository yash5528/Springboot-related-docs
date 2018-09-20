package demo.consul.properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class DistributedPropertiesApplication {

	 public static void main(String[] args) {
	        SpringApplication.run(DistributedPropertiesApplication.class, args);
	    }
	 
}
