package com.sample1.SpringLatest;

import org.springframework.stereotype.Component;

@Component
public class Airtel implements Sim {

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("airtel calling");

	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
System.out.println("airtel data");
	}

}
