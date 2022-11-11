package com.SpringIntegration.Service;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

import com.SpringIntegration.Model.Address;
import com.SpringIntegration.Model.Student;

@MessagingGateway
public interface IntegrationGateway {
	
	
	@Gateway(requestChannel ="integration.gateway.channel")
	public String sendMessage(String message);
	
	@Gateway(requestChannel="integration.gateway.channel")
	public String processStudentDetails(Student student);

	@Gateway(requestChannel="router.channel")
	public <T> void process(T object);

	
}
