package com.sample1.SpringLatest;

import org.springframework.stereotype.Component;


public class Model {

	@Override
	public String toString() {
		return "Model [mode=" + mode + "]";
	}

	private String mode;

	public Model(String mode) {
		super();
		this.mode = mode;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}
	
}
