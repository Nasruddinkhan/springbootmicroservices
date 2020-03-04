 /**
 * 
 */
 package com.mypractice.microservics.currencyexchangeservice.bean;
 /**
 * @author Nasruddin Khan 
 * 21-Sep-2019 - 2:12:50 am
 * ExchangeValue.java
 */

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {
@Id
private Long id;
@Column(name = "currency_from")
private String from;
@Column(name = "currency_to")
private String to;
private BigDecimal conversionMuliple;
private Integer port;
public ExchangeValue() {
	super();
	// TODO Auto-generated constructor stub
}
public ExchangeValue(Long id, String from, String to, BigDecimal conversionMuliple) {
	super();
	this.id = id;
	this.from = from;
	this.to = to;
	this.conversionMuliple = conversionMuliple;
}
public Integer getPort() {
	return port;
}
public void setPort(Integer port) {
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
public BigDecimal getConversionMuliple() {
	return conversionMuliple;
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
public void setConversionMuliple(BigDecimal conversionMuliple) {
	this.conversionMuliple = conversionMuliple;
}
@Override
public String toString() {
	return "ExchangeValue [id=" + id + ", from=" + from + ", to=" + to + ", conversionMuliple=" + conversionMuliple
			+ ", port=" + port + "]";
}
}

 
