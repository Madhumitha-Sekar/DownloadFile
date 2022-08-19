package com.bootdemo.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootdemo.info.EmployeeDemoInfo;
import com.bootdemo.model.EmployeeDemoModel;
import com.bootdemo.repository.EmployeeDemoRepository;
import com.bootdemo.service.EmployeeDemoService;
import com.bootdemo.utils.EmployeeDemoUtil;

@Service
public class EmployeeDemoServiceImpl implements EmployeeDemoService {
	public static Logger log = LoggerFactory.getLogger(EmployeeDemoServiceImpl.class);
	
	@Autowired
	public EmployeeDemoRepository employeeDemoRepository;

	@Autowired
	public EmployeeDemoUtil empDemoUtil;
	
	
	@Override
	public List<EmployeeDemoInfo> getAllEmployeeDetails() {
		log.debug("Enter into the getAllEmployeeDetails method... ");
		List<EmployeeDemoInfo> empDemoInfoList = new ArrayList<>();
		
		try {
			List<EmployeeDemoModel> empModelList = employeeDemoRepository.findAll();
			if (!empModelList.isEmpty()) {
				for (EmployeeDemoModel empDemoModel : empModelList) {
					empDemoInfoList.add(empDemoUtil.convertModelToInfoMethod(empDemoModel));
				}
			}
		} catch (Exception e) {
			log.error("Error occured in the getAllEmployeeDetails method... " + e.getMessage());
			e.printStackTrace();
		}
		
		log.debug("Exit from getAllEmployeeDetails method... ");
		return empDemoInfoList;
	}
	
	
}
