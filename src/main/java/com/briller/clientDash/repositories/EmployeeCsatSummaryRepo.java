package com.briller.clientDash.repositories;

import org.springframework.data.repository.CrudRepository;

import com.briller.clientDash.dto.EmployeeCsatSummary;

public interface EmployeeCsatSummaryRepo extends CrudRepository<EmployeeCsatSummary,Integer> {

 EmployeeCsatSummary findByEmployeeId(Integer empId);
}
