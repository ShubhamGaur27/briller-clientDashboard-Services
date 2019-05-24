package com.briller.clientDash.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.briller.clientDash.response.Response;
import com.briller.clientDash.service.IClientDashboardService;




@RestController
@CrossOrigin
public class ClientDashController {
	
	private final Logger log = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private IClientDashboardService iClientDashboardService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/getClientDashboardData")
	public Response getClientDashboardData(@RequestBody Map<String,String> request) throws Exception {

		log.info("Inside getClientDashboardData" + request);

		return iClientDashboardService.getClientDashboardData(request);

	}


}
