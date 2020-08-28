package com.adapter.phone.impl;

import com.adapter.phone.MicroUsbPhone;

public class Android implements MicroUsbPhone{
private boolean connector;
	public void recharge() {
		// TODO Auto-generated method stub
		 if(connector)
		 {
		 System.out.println("Recharge started");
		 System.out.println("Recharge finished");


		 }
		 else
		 {
		 System.out.println("Connect MICroUSB First");


		 }
	}

	public void useMicroUSB() {
		// TODO Auto-generated method stub
		 connector=true;
		 System.out.println("MiCroUSB Connected");
		
	}

}
