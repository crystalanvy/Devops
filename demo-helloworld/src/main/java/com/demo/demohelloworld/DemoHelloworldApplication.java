package com.demo.demohelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class DemoHelloworldApplication {
	@RequestMapping("/")
	@ResponseBody
	String welcome() {
		return "HelloWorld!";
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoHelloworldApplication.class, args);
	}

}
