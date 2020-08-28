package com.adapter.phone.wrap;

import com.adapter.phone.LightningPhone;
import com.adapter.phone.MicroUsbPhone;


public class LightningToMicroUSBAdapter implements MicroUsbPhone {

	private final LightningPhone lightningPhone;

	public LightningToMicroUSBAdapter(LightningPhone lightningPhone)
	{
		this.lightningPhone=lightningPhone;
	}

	public void recharge() {

		lightningPhone.recharge();		
	}

	public void useMicroUSB() {
		System.out.println("MicroUSB Connected");
		lightningPhone.useLightning();
	}


}
