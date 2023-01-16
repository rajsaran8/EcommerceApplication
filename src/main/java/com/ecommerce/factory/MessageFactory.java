package com.ecommerce.factory;

import com.ecommerce.service.EmailService;
import com.ecommerce.service.MessageService;
import com.ecommerce.service.SMSService;
import com.ecommerce.service.TwitterService;

//factory pattern code
public class MessageFactory {

	private static MessageService messageService;
	
	public static MessageService getInstance() {
		
		messageService = new TwitterService(60,"");
		
		return messageService;
		
	}
}
