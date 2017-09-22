package com.maghi711.spring.springdeveloper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.maghi711.spring.springdeveloper.ioc.Greeting;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDeveloperApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringDeveloperApplication.class, args);
		Greeting greeting = ctx.getBean(Greeting.class);
		String message = greeting.greet("Aadavan");
		System.out.println(message);
	}
}
