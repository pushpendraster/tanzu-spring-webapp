package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;

import com.example.HelloService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@Autowired
	private HelloService helloService;

	@RequestMapping("/")
	public String index() {
		String geeString=helloService.getGreeString();
		return "Hello Super Again User!,Greetings from Spring Boot + Tanzu!";
	}

}