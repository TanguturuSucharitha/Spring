package com.cts.abcd.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component("t1")
public class GreetNoteProviderTimeBasedImpl implements GreetNoteProvider {
	
		public String getGreetNote() {
			LocalDateTime today=LocalDateTime.now();
			int h=today.getHour();
	      String g="";
	      
	      if(h>=1&&h<12) 
	    	  {
	    	  g ="goodmorning";
	    	  }
	    	  
	      else if(h>=12&&h<16) {
	    	  g ="goodafternoon";
	      }
	      else
	      {
	    	  g ="goodevening";
	      }
	      
	    	  return g;
		}

}
