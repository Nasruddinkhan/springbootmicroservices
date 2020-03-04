 /**
 * 
 */
 package com.mypractice.microservices.currencyconversionservices;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mypractice.microservices.currencyconversionservices.bean.CurrencyConversionBean;

/**
 * @author Nasruddin Khan 
 * 21-Sep-2019 - 10:54:17 pm
 * CurrencyConversionController.java
 */
@RestController
public class CurrencyConversionController {
	 protected Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
    private CurrencyConversionProxyService proxyService;
	@GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertCurrency(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity ) {
		Map<String, String> variables = new HashMap<String, String>();
		variables.put("from", from);
		variables.put("to", to);
		ResponseEntity<CurrencyConversionBean> responseEntity = new RestTemplate().getForEntity("http://localhost:8000/exchange-value/from/{from}/to/{to}", CurrencyConversionBean.class,variables);
		CurrencyConversionBean response =responseEntity.getBody();
		System.out.println(response);
		return new CurrencyConversionBean(response.getId(), from, to, response.getConversionMuliple()  , quantity, quantity.multiply(response.getConversionMuliple()), response.getPort());
	}
	@GetMapping("/currency-exchange-feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean feignCurrencyConvert(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity ) {
		CurrencyConversionBean response =proxyService.convertCurrency(from, to);
		System.out.println(response);
		 logger.info("response ->{}" , response);

		return new CurrencyConversionBean(response.getId(), from, to, response.getConversionMuliple()  , quantity, quantity.multiply(response.getConversionMuliple()), response.getPort());
	}
}

 
