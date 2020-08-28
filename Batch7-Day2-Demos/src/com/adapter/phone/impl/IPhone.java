package com.adapter.phone.impl;

import com.adapter.phone.LightningPhone;

public class IPhone implements LightningPhone{
	private boolean connector=false;

	public void recharge() {
		// TODO Auto-generated method stub
		 if(connector)
		 {
		 System.out.println("Recharge started");
		 System.out.println("Recharge finished");


		 }
		 else
		 {
		 System.out.println("Connect Lightning First");


		 }
	}

	public void useLightning() {
		// TODO Auto-generated method stub 
		connector=true;
		System.out.println("Lightning Connected");
		
	}

}
