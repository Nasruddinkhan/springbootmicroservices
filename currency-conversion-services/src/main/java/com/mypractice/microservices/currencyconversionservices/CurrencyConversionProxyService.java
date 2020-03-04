 /**
 * 
 */
 package com.mypractice.microservices.currencyconversionservices;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mypractice.microservices.currencyconversionservices.bean.CurrencyConversionBean;

/**
 * @author Nasruddin Khan 
 * 22-Sep-2019 - 4:21:51 pm
 * CurrencyConversionProxyService.java
 */
 //@FeignClient(name = "currency-exchange-service")
 @FeignClient(name = "netflix-zuul-api-getway-server")
 @RibbonClient(name = "currency-exchange-service")
 public interface CurrencyConversionProxyService {
	 /**
	  * @param from
	  * @param to
	  * @return
	  */
	 @GetMapping("/currency-exchange-service/exchange-value/from/{from}/to/{to}")
	 CurrencyConversionBean convertCurrency(@PathVariable("from") String from, @PathVariable("to") String to);

}

 
