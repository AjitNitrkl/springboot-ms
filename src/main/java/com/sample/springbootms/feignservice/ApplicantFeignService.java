package com.sample.springbootms.feignservice;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

//@FeignClient(name="applicant-service" )//Service Id of applicant service
//,url="http://localhost:8081"
@FeignClient(name="applicant-service", 
url="http://applicant-service-myspringbootprj.1d35.starter-us-east-1.openshiftapps.com")
public interface ApplicantFeignService {
	
   @RequestMapping("/getApplicants")
   public String getApplicants();
   
}