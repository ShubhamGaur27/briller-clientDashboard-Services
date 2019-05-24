package com.briller.clientDash.service.impl;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.briller.clientDash.dto.EmployeeCsatSummary;
import com.briller.clientDash.repositories.AccountCsatRepo;
import com.briller.clientDash.repositories.ClientRepo;
import com.briller.clientDash.repositories.EmployeeCsatSummaryRepo;
import com.briller.clientDash.repositories.EmployeeEmailMappingRepositry;
import com.briller.clientDash.repositories.EmployeeRepositry;
import com.briller.clientDash.response.Relationship;
import com.briller.clientDash.response.Response;
import com.briller.clientDash.response.ResponseData;
import com.briller.clientDash.service.IClientDashboardService;

public class ClientDashboardServiceImpl implements IClientDashboardService {

	private final Logger log = LoggerFactory.getLogger(getClass());

	@Autowired
	private EmployeeRepositry employeeRepositry;

	@Autowired
	private EmployeeEmailMappingRepositry employeeEmailMappingRepositry;

	@Autowired
	private EmployeeCsatSummaryRepo employeeCsatSummaryRepo;

	@Autowired
	private ClientRepo clientRepo;

	@Autowired
	private AccountCsatRepo accountCsatRepo;

	public Response getClientDashboardData(Map<String, String> request) {
		Response response = new Response();
		if (request != null) {

			//String loginEmail = request.get("loginEmail");
			//String domain[] = loginEmail.split("@");

			String empId = employeeEmailMappingRepositry.getEmpId(request.get("email"));
			Integer employeeId = new Integer(empId);

			ResponseData responseData = new ResponseData();
			responseData.setClient(request.get("client"));
			responseData.setEmail(request.get("employeeEmail"));
			responseData.setName(employeeRepositry.getName(employeeId));
			responseData.setImageUrl("");
			responseData.setDesignation("");

			Relationship relationship = new Relationship();

			// responseData.setRelationship();
			EmployeeCsatSummary employeeCsatData = employeeCsatSummaryRepo.findByEmployeeId(employeeId);
			employeeCsatData.getCsat();

			employeeCsatData.getNegative_interactions();
			relationship.setName(clientRepo.findByClientId(employeeCsatData.getClientId()).getFirstName());
			relationship.setImageUrl("");
			relationship.setNumConversations(employeeCsatData.getNum_of_interactions());
			Integer accountId = new Integer(employeeCsatData.getAccountId());
			relationship.setNumEscalations(accountCsatRepo.findByAccountId(accountId).getEscalations());
			responseData.setRelationship(relationship);

		}
		return response;
	}
}