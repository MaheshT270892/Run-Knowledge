package com.springboot.Appstarter.responseTester;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseTester {

	@RequestMapping("/hello")
	public String responseTester() {
		return "this is my first response";
	}
	
	
	
}
