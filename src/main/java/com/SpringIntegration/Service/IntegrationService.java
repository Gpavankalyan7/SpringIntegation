package com.SpringIntegration.Service;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessagingException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class IntegrationService {


	@ServiceActivator(inputChannel="integration.gateway.channel",outputChannel="integration.gateway.channel")
	public Message<String> recieveMessage(Message<String>message);
	{
		MessageBuilder.fromMessage(message);
		Message<String> newMessage= MessageBuilder.withPayload(message.getPayload()+"modified in untegration.gateway.channe,").build();
		
		return newMessage;
		
	}
   
	
	
	@ServiceActivator(inputChannel="integration.gateway.channel")
	public void anotherMessage(Message<String>message)throws MessagingException
	{
		
		MessageChannel replyChannel=(MessageChannel)message.getHeaders().getReplyChannel();
		MessageBuilder.fromMessage(message);
		Message<String>newMessage=MessageBuilder.withPayload("welcome "+message.getPayload()+" to spring Integration").build();
		
		replyChannel.send(newMessage);
	}
}