package com.cignex.rahul.springbootribbonservice3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootRibbonService3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRibbonService3Application.class, args);
	}
}

@RestController
@RequestMapping(value = "/")
class Service3 {

	@GetMapping
	public String fromService3() {
		return "fromService3";
	}
}