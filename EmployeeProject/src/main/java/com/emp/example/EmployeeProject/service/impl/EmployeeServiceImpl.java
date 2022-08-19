package com.emp.example.EmployeeProject.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.example.EmployeeProject.model.Employee;
import com.emp.example.EmployeeProject.repository.EmployeeRepository;
import com.emp.example.EmployeeProject.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository empRepository;

	@Override
	public List<Employee> getAllEmployeeList() {
		List<Employee> empList = empRepository.findAll();
		for (Employee employee : empList) {
			System.out.println(employee.getEmpNo());
			System.out.println(employee.getFirstName());
			System.out.println(employee.getLastName());
			System.out.println(employee.getGender());
			System.out.println(employee.getDesignation());
		}
		
		/*List<Employee> ls = new ArrayList<>();
		Employee emp = new Employee();
		emp.setEmpNo("25");
		ls.add(emp);*/
		return empList;
	}

}
