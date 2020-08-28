package com.factory.method;

import com.factory.Car;
import com.factory.impl.AmdocsCar;
import com.factory.impl.EdurekaCar;

public class CarFactory {

public Car getCar(String carName)
{
	if(carName== null)
	{
		return null;
	}else if(carName.equalsIgnoreCase("EdurekaCar"))
	{
		return new EdurekaCar();
	}else if(carName.equalsIgnoreCase("AmdocsCar"))
	{
		return new AmdocsCar();
	}
	return null;
}
}
