 /**
 * 
 */
 package com.mypractice.microservices.currencyconversionservices.bean;
 /**
 * @author Nasruddin Khan 
 * 21-Sep-2019 - 10:56:25 pm
 * CurrencyConversionBean.java
 */

import java.math.BigDecimal;

public class CurrencyConversionBean {
	private Long id;
	private String from;
	private String to;
	private BigDecimal conversionMuliple;
	private BigDecimal quantity;
	private BigDecimal totalCalculationAmmount;

	private int port;
	public CurrencyConversionBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CurrencyConversionBean(Long id, String from, String to, BigDecimal conversionMuliple,
			BigDecimal quantity,BigDecimal totalCalculationAmmount,int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMuliple = conversionMuliple;
		this.quantity = quantity;
		this.totalCalculationAmmount = totalCalculationAmmount;
		this.port = port;
	}
	public BigDecimal getTotalCalculationAmmount() {
		return totalCalculationAmmount;
	}
	public void setTotalCalculationAmmount(BigDecimal totalCalculationAmmount) {
		this.totalCalculationAmmount = totalCalculationAmmount;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public Long getId() {
		return id;
	}
	public String getFrom() {
		return from;
	}
	public String getTo() {
		return to;
	}
	
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public void setTo(String to) {
		this.to = to;
	}
	
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	
	public BigDecimal getConversionMuliple() {
		return conversionMuliple;
	}
	public void setConversionMuliple(BigDecimal conversionMuliple) {
		this.conversionMuliple = conversionMuliple;
	}
	@Override
	public String toString() {
		return "CurrencyConversionBean [id=" + id + ", from=" + from + ", to=" + to + ", conversionMultiplication="
				+ conversionMuliple + ", quantity=" + quantity + ", totalCalculationAmmount="
				+ totalCalculationAmmount + ", port=" + port + "]";
	}

}

 
