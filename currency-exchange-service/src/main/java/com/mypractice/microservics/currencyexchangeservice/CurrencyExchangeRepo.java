 /**
 * 
 */
 package com.mypractice.microservics.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mypractice.microservics.currencyexchangeservice.bean.ExchangeValue;

/**
 * @author Nasruddin Khan 
 * 21-Sep-2019 - 3:13:49 pm
 * CurrencyExchangeRepo.java
 */
public interface CurrencyExchangeRepo extends JpaRepository<ExchangeValue, Long> {
	ExchangeValue findByFromAndTo(String from, String to);
}

 
