package com.briller.clientDash.service.impl;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.briller.clientDash.repositories.EmployeeEmailMappingRepositry;
import com.briller.clientDash.repositories.EmployeeRepositry;
import com.briller.clientDash.service.IClientDashboardService;

public class ClientDashboardServiceImpl implements IClientDashboardService {

	private final Logger log = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private EmployeeRepositry employeeRepositry;
	
	@Autowired
	private EmployeeEmailMappingRepositry employeeEmailMappingRepositry;

	public List<Map<String,String>> getClientDashboardData(Map<String, String> request) {
		
		if (request != null) {
			String loginEmail = request.get("loginEmail");
			String domain[]=loginEmail.split("@");
			
			Map<String,String> clientDashData=new LinkedHashMap<>();
			clientDashData.put("client",request.get("client"));
			clientDashData.put("email",request.get("email"));
			clientDashData.put("designation","");
			
			String empId=employeeEmailMappingRepositry.getEmpId(request.get("email"));
			Integer employeeId=new Integer(empId);
			clientDashData.put("name",employeeRepositry.getName(employeeId));
			
			
			
			
			
		}

	}
}