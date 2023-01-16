package com.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ecommerce.model.Tyre;

@Component
public class EmailService implements MessageService {

	@Autowired
	private Tyre tyre;
	
	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}
	
	public boolean sendMessage(String address, String message) {
		
		String regex="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		
		boolean messageStatus=false;
		
		if(address.matches(regex)) {
			messageStatus=true;
			System.out.println("The Email Is: "+ message + " Send to "+address + " " + tyre);
		}
		
		return messageStatus;
	}

	

}
