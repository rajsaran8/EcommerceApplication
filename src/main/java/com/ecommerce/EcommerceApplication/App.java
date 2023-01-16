package com.ecommerce.EcommerceApplication;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ecommerce.model.Tyre;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Scanner sc;

	public static void main( String[] args )
    {
 
    	ClientMessagingSystem cms = new ClientMessagingSystem();
    	
    	sc = new Scanner(System.in);
    	
    	System.out.println("Please enter your address");
    	
    	String address = sc.nextLine();
    	
    	System.out.println("Please enter your message");
    	
    	String message = sc.nextLine();
    	
    	cms.send(address, message);
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    
    	Tyre t= (Tyre) context.getBean("tyre");
    	System.out.println(t);
    	
    
    }
}
