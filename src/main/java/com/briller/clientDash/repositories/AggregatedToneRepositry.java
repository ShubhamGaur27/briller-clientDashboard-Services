package com.briller.clientDash.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.briller.clientDash.dto.AggregatedTone;

@Repository
public interface AggregatedToneRepositry extends CrudRepository<AggregatedTone, java.lang.Integer> {

}
