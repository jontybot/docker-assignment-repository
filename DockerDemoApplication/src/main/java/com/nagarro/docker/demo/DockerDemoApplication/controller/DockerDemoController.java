package com.nagarro.docker.demo.DockerDemoApplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerDemoController {
	@RequestMapping("/")  
	public String hello()   
	{  
	return "Spring Boot Application Is Running";  
	}  

}
