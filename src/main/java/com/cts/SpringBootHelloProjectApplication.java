package com.cts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootHelloProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloProjectApplication.class, args);
	}

	@GetMapping("/hello")
	public String getMsg() {
		return "hello welcome to aws ecs";
	}
	
	 @GetMapping("/{name}")
	    public String welcome(@PathVariable String name) {
	        return "Hi " + name + " Welcome to  AWS ECS using CICD Example";
	    }

}
