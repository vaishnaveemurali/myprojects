package com.psg.test.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.psg.test.domain.Customer;

@Repository
@Component
public interface CustomerRepository extends MongoRepository<Customer, Long>{
	
}
