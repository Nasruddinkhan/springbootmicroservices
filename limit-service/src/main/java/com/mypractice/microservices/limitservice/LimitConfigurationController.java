 /**
 * 
 */
 package com.mypractice.microservices.limitservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mypractice.microservices.bean.LimitConfiguration;

/**
 * @author Nasruddin Khan 
 * 17-Sep-2019 - 3:45:50 pm
 * LimitConfigurationController.java
 */
@RestController
public class LimitConfigurationController {
	@Autowired
	private Configuration configuration;
	@GetMapping("/limit-service")
	public LimitConfiguration retrivelLimit() {
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
	}
}

 
