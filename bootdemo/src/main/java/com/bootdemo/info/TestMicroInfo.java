package com.bootdemo.info;

public class TestMicroInfo {
	
	public TestMicroInfo(Integer minimum, Integer maximum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
	}
	
	private Integer minimum;
	private Integer maximum;

	public Integer getMinimum() {
		return minimum;
	}

	public Integer getMaximum() {
		return maximum;
	}

}
