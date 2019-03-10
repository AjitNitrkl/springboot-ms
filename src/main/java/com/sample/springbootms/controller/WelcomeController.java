package com.sample.springbootms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.springbootms.feignservice.ApplicantFeignService;

@RestController
public class WelcomeController {

	@Value("${welcome.message}")
	private String welcomeMessage;
	
	@Autowired
	ApplicantFeignService feignService;

	@GetMapping("/ms/msg")
	public String retrieveWelcomeMessage() {
    	return feignService.getApplicants();
		//return welcomeMessage;
	}
}