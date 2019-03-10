package com.sample.springbootms.feignservice;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

//@FeignClient(name="applicant-service" )//Service Id of applicant service
@FeignClient(name="applicant-service",url="http://localhost:8080")
public interface ApplicantFeignService {
	
   @RequestMapping("/getApplicants")
   public String getApplicants();
   
}