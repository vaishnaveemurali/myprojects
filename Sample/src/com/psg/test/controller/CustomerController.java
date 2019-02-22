package com.psg.test.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	@RequestMapping(value = "/healthcheck", method = RequestMethod.GET)
	 public String getHealthStatus(){
		String status = "App is Up";
		System.out.println("Test1");
		return status ;
		 
	 }
	
	 @RequestMapping(value = "/AddCustomer", method = RequestMethod.POST)
	 public String addCustomerInfo(@RequestBody String customerId,@RequestBody String customerName,@RequestBody String contactNumber){
		String status = "";
		System.out.println("Test1");
		return status ;
		 
	 }

	 @RequestMapping(value = "/DeleteCustomer", method = RequestMethod.POST)
	 public String deleteCustomerInfo(@RequestBody String customerId){
		String status = "";
		System.out.println("Test1");
		return status ;
		 
	 }
}
