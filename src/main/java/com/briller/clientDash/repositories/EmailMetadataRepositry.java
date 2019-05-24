package com.briller.clientDash.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.briller.clientDash.dto.EmailMetaDataDto;

@Repository
public interface EmailMetadataRepositry extends CrudRepository<EmailMetaDataDto, Integer> {

}
