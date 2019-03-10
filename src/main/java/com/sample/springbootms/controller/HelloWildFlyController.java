package com.sample.springbootms.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.springbootms.feignservice.ApplicantFeignService;

@RestController
public class HelloWildFlyController {
	
	@Autowired
	ApplicantFeignService feignService;


    @RequestMapping("hello")
    public String sayHello(){
    	return feignService.getApplicants();
       // return ("Hello, SpringBoot on Wildfly");
    }
    
	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}
    
}
