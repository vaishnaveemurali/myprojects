package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Customer;
import com.example.demo.service.CustomerService;

@Component
@RestController
@RequestMapping("/test")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	
	@RequestMapping(value = "/healthcheck", method = RequestMethod.GET)
	 public @ResponseBody String getHealthStatus(){
		String status = "App is Up";
		System.out.println("Test1");
		return status ;
		 
	 }
	
	@RequestMapping(value = "/GetAllCustomer", method = RequestMethod.GET)
	 public @ResponseBody List<Customer> getAllCustomerInfo(){
		String status = "";
		System.out.println("Test1");
		return customerService.getAllCustomers() ;
		 
	 }
	
	 @RequestMapping(value = "/AddCustomer", method = RequestMethod.POST)
	 public String addCustomerInfo(@RequestBody Customer custObj){
		String status = "";
		customerService.addCustomerInfo(custObj);
		return status ;
		 
	 }

	 @RequestMapping(value = "/DeleteCustomer", method = RequestMethod.POST)
	 public String deleteCustomerInfo(@RequestBody String customerNum){
		String status = "";
		System.out.println("Test1");
		customerService.deleteCustomerInfo(customerNum);
		return status ;
		 
	 }
}
