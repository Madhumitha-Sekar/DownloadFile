package com.bootdemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bootdemo.constants.EmpDemoConstants;
import com.bootdemo.demoservice.Configuration;
import com.bootdemo.info.EmployeeDemoInfo;
import com.bootdemo.info.StatusResponseDTO;
import com.bootdemo.info.TestMicroInfo;
import com.bootdemo.service.EmployeeDemoService;
import com.bootdemo.utils.CommonUtils;

@RestController
@RequestMapping(value = "/demo")
public class EmployeeDemoController {
	public static Logger log = LoggerFactory.getLogger(EmployeeDemoController.class);

	@Autowired
	private Environment env;

	@Autowired
	private Configuration configuration;
	
	@Autowired
	private EmployeeDemoService employeeDemoService;

	
	@RequestMapping(value = "/method1", method = RequestMethod.GET, produces = { "application/json" })
	public ResponseEntity<String> getDemoMethod() {
		System.out.println("getDemoMethod invoked successfully...");
		return new ResponseEntity<String>("method1 working successfully in springboot1...", HttpStatus.OK);
	}

	
	@RequestMapping(value = "/getEmployee", method = RequestMethod.GET, produces = { "application/json" })
	public ResponseEntity<String> getAllEmployeeMethod() {
		log.debug("Enter into the getAllEmployeeMethod()... ");
		StatusResponseDTO responseDTO = new StatusResponseDTO();
		responseDTO.setStatus(EmpDemoConstants.FAILURE.getValue());

		try {
			List<EmployeeDemoInfo> employeeList = employeeDemoService.getAllEmployeeDetails();
			if (employeeList.isEmpty()) {
				responseDTO.setMessage("Employee list is empty...");
				return new ResponseEntity<String>(CommonUtils.convertToJSONObject(responseDTO),
						HttpStatus.PARTIAL_CONTENT);
			}
			
			responseDTO.setEmployeeDemoList(employeeList);
			responseDTO.setStatus(EmpDemoConstants.SUCCESS.getValue());
			responseDTO.setMessage("Employee list is retrieved successfully");
			log.debug("Exit the getAllEmployeeMethod()... ");
			return new ResponseEntity<String>(CommonUtils.convertToJSONObject(responseDTO), HttpStatus.OK);
		} catch (Exception e) {
			log.error("Error occured in the getAllEmployeeMethod()... " + e);
			responseDTO.setMessage(env.getProperty(EmpDemoConstants.SERVER_PROBLEM.getValue()));
			return new ResponseEntity<String>(CommonUtils.convertToJSONObject(responseDTO), HttpStatus.PARTIAL_CONTENT);
		}
	}
	
	@RequestMapping(value = "/testmicro", method = RequestMethod.GET, produces = { "application/json" })
	public ResponseEntity<String> getTestMicroMethod() {
		log.debug("Enter into the getTestMicroMethod()... ");
		StatusResponseDTO responseDTO = new StatusResponseDTO();
		responseDTO.setStatus(EmpDemoConstants.SUCCESS.getValue());
		responseDTO.setMessage("Basic sample for microservice...");
		responseDTO.setTestMicroInfo(new TestMicroInfo(configuration.getMinimum(), configuration.getMaximum()));
		
		List<EmployeeDemoInfo> employeeDemoList = new ArrayList<>();
		EmployeeDemoInfo empDemoInfo = new EmployeeDemoInfo();
		empDemoInfo.setEmpId(10);
		empDemoInfo.setFirstName(configuration.getFirstName());
		empDemoInfo.setLastName("Computer");
		employeeDemoList.add(empDemoInfo);
		
		responseDTO.setEmployeeDemoList(employeeDemoList);
		return new ResponseEntity<String>(CommonUtils.convertToJSONObject(responseDTO), HttpStatus.OK);
		
	}
}
