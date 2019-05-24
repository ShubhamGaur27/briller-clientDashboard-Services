package com.briller.clientDash.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.briller.clientDash.dto.EmailHeader;

@Repository
public interface EmailHeaderRepositry extends CrudRepository<EmailHeader, Integer> {

}
