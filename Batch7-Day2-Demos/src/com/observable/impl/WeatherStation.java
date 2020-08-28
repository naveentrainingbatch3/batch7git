package com.observable.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.observable.Observable;
import com.observer.WeatherObserver;

public class WeatherStation implements Observable {

	private List<WeatherObserver> weatherObservers;
	private int temperature;

	public void setTemperature(int temperature)
	{
		System.out.println("Weather Station updating temperature to"+temperature);
		this.temperature=temperature;
		doNotify();
	}

	public WeatherStation(int temperature) {
		weatherObservers=new ArrayList<WeatherObserver>();
		this.temperature=temperature;
	}

	public void addObserver(WeatherObserver weatherObserver) {
		weatherObservers.add(weatherObserver);

	}

	public void removeObserver(WeatherObserver weatherObserver) {
		// TODO Auto-generated method stub
		weatherObservers.remove(weatherObserver);
	}

	public void doNotify() {
		Iterator<WeatherObserver> iterator=   weatherObservers.iterator();
		while(iterator.hasNext())
		{
			WeatherObserver 	 weatherObserver=iterator.next();
			weatherObserver.doUpdate(temperature);
		}
	}

}
