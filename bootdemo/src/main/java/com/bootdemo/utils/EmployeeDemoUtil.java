package com.bootdemo.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.bootdemo.info.EmployeeDemoInfo;
import com.bootdemo.model.EmployeeDemoModel;

@Service
public class EmployeeDemoUtil {
	public static Logger log = LoggerFactory.getLogger(EmployeeDemoUtil.class);
	
	/**
	 * Convert from 'EmployeeDemoModel' object to 'EmployeeDemoInfo' object
	 * @param empDemoModel
	 * @return
	 */
	public EmployeeDemoInfo convertModelToInfoMethod(EmployeeDemoModel empDemoModel) {
		EmployeeDemoInfo empDemoInfo = new EmployeeDemoInfo();
		empDemoInfo.setEmpId(empDemoModel.getEmpId());
		empDemoInfo.setFirstName(empDemoModel.getFirstName());
		empDemoInfo.setLastName(empDemoModel.getLastName());
		empDemoInfo.setGender(empDemoModel.getGender());
		empDemoInfo.setDesignation(empDemoModel.getDesignation());
		return empDemoInfo;
	}

	
}
