package com.cts.swrd.model;

import java.io.Serializable;

public class AppSecurityToken implements Serializable {
	private static final long serialVersionUID=-809187909192L;
	private final String jwttoken;
	
	public AppSecurityToken(String jwttoken) {
		this.jwttoken = jwttoken;
	}

	public String getJwttoken() {
		return jwttoken;
	}
	
	
}
