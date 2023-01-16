package com.ecommerce.service;

import org.springframework.stereotype.Component;

@Component
public class SMSService implements MessageService {

	public boolean sendMessage(String address, String message) {
		
		String regex="\\d{10}";
		
		boolean messageStatus=false;
		
		if(address.matches(regex)) {
			messageStatus=true;
			System.out.println("The Message Is: "+ message + " Send to "+address);
		}
		return messageStatus;
	}

}
