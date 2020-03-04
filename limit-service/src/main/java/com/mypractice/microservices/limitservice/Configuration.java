 /**
 * 
 */
 package com.mypractice.microservices.limitservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
/**
 * @author Nasruddin Khan 
 * 17-Sep-2019 - 3:52:21 pm
 * Configration.java
 */
@Component
@ConfigurationProperties("limit-service")
public class Configuration {
	private int minimum;
	private int maximum;
	public int getMinimum() {
		return minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

}

 