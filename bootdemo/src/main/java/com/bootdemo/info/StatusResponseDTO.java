package com.bootdemo.info;

import java.util.List;

public class StatusResponseDTO {

	private String status;
	
	private String message;
	
	private List<EmployeeDemoInfo> employeeDemoList;

	private TestMicroInfo testMicroInfo;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public List<EmployeeDemoInfo> getEmployeeDemoList() {
		return employeeDemoList;
	}
	public void setEmployeeDemoList(List<EmployeeDemoInfo> employeeDemoList) {
		this.employeeDemoList = employeeDemoList;
	}
	
	public TestMicroInfo getTestMicroInfo() {
		return testMicroInfo;
	}
	public void setTestMicroInfo(TestMicroInfo testMicroInfo) {
		this.testMicroInfo = testMicroInfo;
	}
	
}
