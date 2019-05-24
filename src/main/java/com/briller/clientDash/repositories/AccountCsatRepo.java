package com.briller.clientDash.repositories;

import org.springframework.data.repository.CrudRepository;

import com.briller.clientDash.dto.AccountCsatSummary;

public interface AccountCsatRepo extends CrudRepository<AccountCsatSummary,Integer> {
	
	AccountCsatSummary findByAccountId(int accountId);

}
