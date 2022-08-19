package com.emp.example.EmployeeProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.emp.example.EmployeeProject.service.EmployeeService;
import com.google.gson.Gson;

@RestController
@RequestMapping(value = "/emp/api")
@CrossOrigin
public class EmployeeController {

	@Autowired
	private EmployeeService empService;

	@CrossOrigin
	@RequestMapping(value = "/all", method = RequestMethod.GET, produces = { "application/json" })
	public ResponseEntity<String> getAllUsers() {
		System.out.println("EmployeeController.getAllUsers()... ");
		/*String mongoClientURI = "mongodb://" + DB_SRV_USR + ":" + DB_SRV_PWD + "@" + DB_URL + ":" + DB_PORT_CUS + "/" + dbName;
		MongoClientURI connectionString = new MongoClientURI(mongoClientURI);

		// enable SSL connection
		MongoClientOptions.builder().sslEnabled(true).build();

		if (this.mongoClient == null) {
		    this.mongoClient = new MongoClient(connectionString);
		}

		// create database if doesn't exist
		MongoDatabase mdb = this.mongoClient.getDatabase(dbName);

		
		try {
		    mongo.getAddress();
		    System.out.println("EmployeeController.getAllUsers()... MONGO DB connection success.. ");
		} catch (Exception e) {
		    System.out.println("Database unavailable!");
		    mongo.close();
		    return;
		}*/
		return new ResponseEntity<String>(new Gson().toJson(empService.getAllEmployeeList()), HttpStatus.OK);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/test", method = RequestMethod.GET, produces = { "application/json" })
	public ResponseEntity<String> testMethod() {
		System.out.println("EmployeeController.testMethod()... ");
		return new ResponseEntity<String>(new Gson().toJson("test success"), HttpStatus.OK);
	}
	
}
