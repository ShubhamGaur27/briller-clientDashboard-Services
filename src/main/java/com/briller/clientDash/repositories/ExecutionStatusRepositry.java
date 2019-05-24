package com.briller.clientDash.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.briller.clientDash.dto.ExecutionStatus;

public interface ExecutionStatusRepositry extends CrudRepository<ExecutionStatus, Integer> {

	String query = "SELECT * From EXECUTION_STATUS";

	@Query(value = query, nativeQuery = true)
	public List<ExecutionStatus> getExecutionStatus();

}
