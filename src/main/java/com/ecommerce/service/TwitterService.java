package com.ecommerce.service;

public class TwitterService implements MessageService {

	private int characterLength;
	
	//Parameterized constructor
	public TwitterService(int characterLength,String twitterId) {	
		this.characterLength = characterLength;
	}


	public boolean sendMessage(String address, String message) {
		
		boolean messageStatus=false;
		
		if(address.contains("@") && message.length()<=this.characterLength) {
			messageStatus=true;
			System.out.println("The Tweet Is: "+ message + " Send to "+address);
		}
		
		return messageStatus;
	}

}
