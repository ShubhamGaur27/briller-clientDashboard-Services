package com.briller.clientDash.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.briller.clientDash.dto.IndividualTone;

@Repository
public interface IndividualToneRepositry extends CrudRepository<IndividualTone, Integer> {

}
