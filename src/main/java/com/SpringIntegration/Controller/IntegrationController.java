package com.SpringIntegration.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringIntegration.Model.Address;
import com.SpringIntegration.Model.Student;
import com.SpringIntegration.Service.IntegrationGateway;

@RestController
@RequestMapping("/integrate")
public class IntegrationController {
	
	@Autowired
	private IntegrationGateway integrationGateway;
	
	@GetMapping(value="{name}")
	public String getMessageFromIntegrationService(@PathVariable("name") String name)
	{
		return integrationGateway.sendMessage(name);
	}
	
	@PostMapping("/student")
	public void processStudentDetails(@RequestBody Student student)
	{
		integrationGateway.processStudentDetails(student);
		
	}
	@PostMapping("/address")
	public void processAddressDetails(@RequestBody Address address)
	{
		integrationGateway.process(address);
	}
	
	
	
	
	
	
	
	
	
	/*
	@PostMapping
	public String prcoessStudentDetails(RequestBody Student student)
	{
		return integrationGateway.processStudentDetails(student);
	}
	*/
}
