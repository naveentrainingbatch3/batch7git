package com.subject;

import com.observer.WeatherObserver;

public class TVChannels implements WeatherObserver {

	public void doUpdate(int temperature) {
		// TODO Auto-generated method stub
		System.out.println("TVChannel are updating temperature as"+temperature);
	}

}
