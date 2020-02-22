package com.cts.abcd.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("s1")
//@Primary

public class GreetNoteProviderSimpleImpl implements GreetNoteProvider {
	
	public String getGreetNote() {
		return "Hello";
	}
}
