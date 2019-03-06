package com.psg.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psg.test.domain.Customer;
import com.psg.test.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	 public String addCustomerInfo(Customer custObj){
		String status = "";
		System.out.println("Test1");
		customerRepository.save(custObj);
		return status ;
		 
	 }

	 public String deleteCustomerInfo(String customerId){
		String status = "";
		System.out.println("Test1");
		customerRepository.deleteById(Long.valueOf(customerId));
		return status ;
		 
	 }
	
}
