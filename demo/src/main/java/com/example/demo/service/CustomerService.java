package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Customer;
import com.example.demo.repository.CustomerRepository;


@Service
@Component
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	 public String addCustomerInfo(Customer custObj){
		String status = "";
		customerRepository.save(custObj);
		status = "Saved Successfully!!";
		return status ;
		 
	 }

	 public String deleteCustomerInfo(String customerNum){
		String status = "";
		Customer delCust = new Customer();
		delCust.setCustomerNumber(customerNum);
		customerRepository.delete(delCust);;
		status = "Deleted Successfully!!";
		return status ;
		 
	 }

	public List<Customer> getAllCustomers() {
		System.out.println("Test2");
		List<Customer> custList = customerRepository.findAll();
		return custList ;
		
	}
	
}
