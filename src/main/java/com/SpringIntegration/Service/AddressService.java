package com.SpringIntegration.Service;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessagingException;
import org.springframework.stereotype.Component;

@Component
public class AddressService {

	
	@ServiceActivator(inputChannel = "address.channel")
	public void recieveMessage(Message<?>message)throws MessagingException
	{
			System.out.println("#############address.channe#########");
			System.out.println(message);
			System.out.println("####################");
			System.out.println(message.getPayload());
	}
}
