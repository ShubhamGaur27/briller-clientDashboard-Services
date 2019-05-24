package com.briller.clientDash.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.briller.clientDash.dto.Employee;

public interface EmployeeRepositry extends CrudRepository<Employee,Integer> {
	
	@Query("select first_name from Employee e where e.employeeId= :employeeId")
	public String getName(@Param("employeeId") int employeeId);

}
