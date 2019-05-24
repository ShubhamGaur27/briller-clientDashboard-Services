package com.briller.clientDash.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.briller.clientDash.dto.EmailPreferenceMap;

@Repository
public interface EmailPreferenceMapRepositry extends CrudRepository<EmailPreferenceMap, Integer> {

}
