package com.ecommerce.EcommerceApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ecommerce.factory.MessageFactory;
import com.ecommerce.service.EmailService;
import com.ecommerce.service.MessageService;
import com.ecommerce.service.SMSService;
import com.ecommerce.service.TwitterService;

public class ClientMessagingSystem {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

	//private MessageService messageService = MessageFactory.getInstance();
	
	private MessageService messageService = (MessageService) context.getBean("emailService");
	
	public void send(String address,String message) {
		
		boolean messageStatus = this.messageService.sendMessage(address, message);
		
		if(!messageStatus) {
			System.out.println("Sorry invalid address given,Please resend message");
		}
	}

}
