package com.helloWorld.Hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@SpringBootApplication
public class HelloApplication {
	
	@RequestMapping("/")
	String helloworld() {
		return "Utilizei persistência e orientação ao futuro!";
	}
	
	
	@RequestMapping("/rota2")
	String helloworld2() {
		return "Irei aprender a como construir um back-end com Spring e como funciona uma app web com linguagem Java!";
	}
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

}
