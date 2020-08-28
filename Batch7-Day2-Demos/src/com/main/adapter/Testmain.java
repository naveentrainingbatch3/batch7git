package com.main.adapter;

import com.adapter.phone.LightningPhone;
import com.adapter.phone.MicroUsbPhone;
import com.adapter.phone.impl.Android;
import com.adapter.phone.impl.IPhone;
import com.adapter.phone.wrap.LightningToMicroUSBAdapter;

public class Testmain {

	public static void rechargeMicroUSBPhone(MicroUsbPhone phone)
	{
		phone.useMicroUSB();
		phone.recharge();
	}
	public static void rechargeLightningPhone(LightningPhone phone)
	{
		phone.useLightning();
		phone.recharge();
	}
	public static void main(String[] args) {
		Android android=new Android();
		IPhone iphone=new IPhone();
		System.out.println("Recharging Android with MicroUSBPhone");
		rechargeMicroUSBPhone(android);
		System.out.println("Recharging Iphone with  LightningPhone");
		rechargeLightningPhone(iphone);
		System.out.println("Recharging IPhone with MicroUSB");
		rechargeMicroUSBPhone(new LightningToMicroUSBAdapter(iphone));
	}
}
