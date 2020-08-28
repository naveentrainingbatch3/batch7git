package com.subject;

import com.observer.WeatherObserver;

public class NewsPaper implements WeatherObserver {

	public void doUpdate(int temperature) {
		// TODO Auto-generated method stub
System.out.println("Newspaper are updating temperature as"+temperature);
	}

}
