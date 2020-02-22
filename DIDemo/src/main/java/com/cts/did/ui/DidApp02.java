package com.cts.did.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.did.GreetService;
import com.cts.did.GreetServiceAdvancedImpl;
import com.cts.did.GreetServiceEnhancedImpl;
import com.cts.did.GreetServiceSimpleImpl;

public class DidApp02 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bean2.xml");
		
	
	

		GreetServiceEnhancedImpl gs2=(GreetServiceEnhancedImpl) context.getBean("g2");
		gs2.setGreeting("vanakam");
		System.out.println(gs2.greet("suchi"));
		
		

		GreetServiceEnhancedImpl gs3=(GreetServiceEnhancedImpl) context.getBean("g2");
		System.out.println(gs3.greet("suchi"));
		
		GreetService gs4=(GreetService) context.getBean("g3");
		System.out.println(gs4.greet("suchi"));
		

	}

}
