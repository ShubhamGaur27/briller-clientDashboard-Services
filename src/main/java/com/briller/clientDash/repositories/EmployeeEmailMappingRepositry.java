package com.briller.clientDash.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.briller.clientDash.dto.EmpEmailMap;
import com.briller.clientDash.dto.EmployeeEmailMapping;

@Repository
public interface EmployeeEmailMappingRepositry extends CrudRepository<EmployeeEmailMapping, EmpEmailMap> {
	public List<EmployeeEmailMapping> findByAnalyseTone(String analyseTone);
	
	@Query("select employeeId from EmployeeEmailMapping e where e.emailId= :email")
	public String getEmpId(@Param("email") String email);
}
