package com.cloudserverconfig.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class Configuration {

	private int lowerLimit;
	private int higherLimit;

	public Configuration() {}
	
	public Configuration(int lower, int higher) {
		this.lowerLimit = lower;
		this.higherLimit = higher;
	}
	
	
	public int getLowerLimit() {
		return lowerLimit;
	}
	public void setLowerLimit(int lowerLimit) {
		this.lowerLimit = lowerLimit;
	}
	public int getHigherLimit() {
		return higherLimit;
	}
	public void setHigherLimit(int higherLimit) {
		this.higherLimit = higherLimit;
	}
	
	

}
