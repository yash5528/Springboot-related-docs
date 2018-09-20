package demo.boot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@SpringBootApplication
public class SpringBootWebApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebApplication.class, args);
	}

// Fix the code ... call the lab2.1-boot-web-service
	
}
