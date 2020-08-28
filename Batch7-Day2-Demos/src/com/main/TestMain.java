package com.main;

import com.factory.Car;
import com.factory.method.CarFactory;

public class TestMain {
	public static void main(String[] args) {
		CarFactory carFactory=new CarFactory();
		Car c1=carFactory.getCar("EdurekaCar");
		c1.start();
		c1.drive();
		c1.applyBreak();
		c1.stop();
		Car c2=carFactory.getCar("AmdocsCar");
		c2.start();
		c2.drive();
		c2.applyBreak();
		c2.stop();
		
	}
}