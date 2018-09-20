package hello;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@EnableDiscoveryClient
@SpringBootApplication
public class ConsulServiceApplication {

    public static void main(String[] args) {
    	 SpringApplication.run(ConsulServiceApplication.class,args);
   
}

@RestController
class SimpleController {

    @RequestMapping("/")
    public String disp()
    {
    	return "hi.. from microservice";
    }
}
}