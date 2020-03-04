 /**
 * 
 */
 package com.mypractice.microservics.currencyexchangeservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mypractice.microservics.currencyexchangeservice.bean.ExchangeValue;

/**
 * @author Nasruddin Khan 
 * 21-Sep-2019 - 2:10:23 am
 * CurrencyExchangeController.java
 */
 @RestController
 public class CurrencyExchangeController {
	 protected Logger logger = LoggerFactory.getLogger(this.getClass());
	 @Autowired
	 private Environment env;
	 @Autowired
	 private CurrencyExchangeRepo repo;
	 @GetMapping("/exchange-value/from/{from}/to/{to}")
	 public ExchangeValue getExchangeValue(@PathVariable String from, @PathVariable String to) {
		 ExchangeValue exchangeValue =	repo.findByFromAndTo(from, to);
		 exchangeValue.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		 logger.info("exchangeValue ->{}" , exchangeValue);
		 return exchangeValue;
	 }
}

 
