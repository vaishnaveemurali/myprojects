package com.psg.test.controller;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.ListCollectionsIterable;
import com.mongodb.client.MongoDatabase;
import com.psg.test.domain.Customer;
import com.psg.test.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	
	@RequestMapping(value = "/healthcheck", method = RequestMethod.GET)
	 public String getHealthStatus(){
		String status = "App is Up";
		MongoClientURI uri = new MongoClientURI("mongodb+srv://mongoadmin:admin123@cluster1-spuad.mongodb.net/mydb?retryWrites=true");

			MongoClient mongoClient = new MongoClient(uri);
			MongoDatabase database = mongoClient.getDatabase("test");
			ListCollectionsIterable<Document> docs = database.listCollections();
			for (Document document : docs) {
				System.out.println(document.toJson());
			}
			mongoClient.close();
		System.out.println("Test1");
		return status ;
		 
	 }
	
	 @RequestMapping(value = "/AddCustomer", method = RequestMethod.POST)
	 public String addCustomerInfo(@RequestBody Customer custObj){
		String status = "";
		System.out.println("Test1");
		customerService.addCustomerInfo(custObj);
		return status ;
		 
	 }

	 @RequestMapping(value = "/DeleteCustomer", method = RequestMethod.POST)
	 public String deleteCustomerInfo(@RequestBody String customerId){
		String status = "";
		System.out.println("Test1");
		customerService.deleteCustomerInfo(customerId);
		return status ;
		 
	 }
}
