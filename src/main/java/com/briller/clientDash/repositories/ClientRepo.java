package com.briller.clientDash.repositories;

import org.springframework.data.repository.CrudRepository;

import com.briller.clientDash.dto.Client;

public interface ClientRepo extends CrudRepository<Client,Integer> {

Client findByClientId(int clientId);
}
