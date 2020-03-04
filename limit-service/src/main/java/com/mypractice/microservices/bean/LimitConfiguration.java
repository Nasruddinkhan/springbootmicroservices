/**
* 
*/
package com.mypractice.microservices.bean;

/**
 * @author Nasruddin Khan 17-Sep-2019 - 3:47:19 pm LimitConfiguration.java
 */
public class LimitConfiguration {
	private int maximum;
	private int minimum;

	public LimitConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}

	public LimitConfiguration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getMaximum() {
		return maximum;
	}

	public int getMinimum() {
		return minimum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

}
