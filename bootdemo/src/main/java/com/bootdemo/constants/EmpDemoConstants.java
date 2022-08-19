package com.bootdemo.constants;

public enum EmpDemoConstants {
	SUCCESS("Success"), FAILURE("Failure"), SERVER_PROBLEM("server.problem"), INVALID_CREDS("invalid.creds");
	
	private String value;
	
	private EmpDemoConstants(String value) {
		this.value = value;
	}
	public String getValue() {
		return value;
	}

}
