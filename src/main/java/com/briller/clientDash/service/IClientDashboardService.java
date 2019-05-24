package com.briller.clientDash.service;

import java.util.Map;

import com.briller.clientDash.response.Response;

public interface IClientDashboardService {

	Response getClientDashboardData(Map<String,String> request);
}
