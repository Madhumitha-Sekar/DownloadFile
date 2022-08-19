package com.bootdemo.demoservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("demo-service")
public class Configuration {

	private Integer minimum;
	private Integer maximum;
	private Integer addContent;
	private String firstName;
	
	public Integer getMinimum() {
		return minimum;
	}
	public void setMinimum(Integer minimum) {
		this.minimum = minimum;
	}
	
	public Integer getMaximum() {
		return maximum;
	}
	public void setMaximum(Integer maximum) {
		this.maximum = maximum;
	}
	
	public Integer getAddContent() {
		return addContent;
	}
	public void setAddContent(Integer addContent) {
		this.addContent = addContent;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
}
