package com.cignex.rahul.springbootribbonservice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootRibbonService2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRibbonService2Application.class, args);
	}
}

@RestController
@RequestMapping(value="/")
class Service2{
	
	@GetMapping
	public String fromService2() {
		return "fromService2";
	}
}