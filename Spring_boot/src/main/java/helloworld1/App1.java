package helloworld1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@SpringBootApplication
public class App1 {

	@RequestMapping("/hello")
	public String hello(){
	   return"Hello world!";
	}
	  
	public static void main(String[] args) {
	   SpringApplication.run(App1.class, args);
	}
	
}