package demo.boot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
//public class SpringBootWebApplication extends SpringBootServletInitializer {

@ManagedResource("custom:name=spring")
public class SpringBootWebApplication
{
	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebApplication.class, args);
	}

	@RequestMapping("/")
	public String greetings(){
		return "God is great.. spring boot easy";
	}
}
