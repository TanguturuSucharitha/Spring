package com.cts.did.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.did.GreetService;
import com.cts.did.GreetServiceSimpleImpl;

public class DidApp01 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
		
		GreetService gs=(GreetService) context.getBean("g1");
		System.out.println(gs.greet("suchi"));

	
		GreetService gs1=(GreetService) context.getBean("g2");
		System.out.println(gs1.greet("suchi"));
		

		GreetService gs2=(GreetService) context.getBean("g3");
		System.out.println(gs2.greet("suchi"));
		
		GreetService gs3=(GreetService) context.getBean("g4");
		System.out.println(gs3.greet("suchi"));





	}

}
