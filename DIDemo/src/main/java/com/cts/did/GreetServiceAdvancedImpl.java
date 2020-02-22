package com.cts.did;

public class GreetServiceAdvancedImpl implements GreetService {

	private GreetNoteProvider gnp;
	private String greeting;
		
	public GreetServiceAdvancedImpl() {
	
	}
	
		public GreetNoteProvider getGnp() {
		return gnp;
	}


	public void setGnp(GreetNoteProvider gnp) {
		this.gnp = gnp;
	}

	public String greet(String userName) {
		// TODO Auto-generated method stub
		return gnp.getGreetNote()+userName;
	}


				
}
