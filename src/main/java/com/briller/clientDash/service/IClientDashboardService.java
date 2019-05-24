package com.briller.clientDash.service;

import java.util.List;
import java.util.Map;

public interface IClientDashboardService {

	List<Map<String,String>> getClientDashboardData(Map<String,String> request);
}
