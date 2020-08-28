package com.observable.main;

import com.observable.impl.WeatherStation;
import com.subject.NewsPaper;
import com.subject.TVChannels;

public class TestMain {
public static void main(String[] args) {
	TVChannels observer1=new TVChannels();
	NewsPaper observer2=new NewsPaper();
	WeatherStation weatherStation=new WeatherStation(40);
	weatherStation.addObserver(observer1);
	weatherStation.addObserver(observer2);
	weatherStation.setTemperature(35);
	weatherStation.removeObserver(observer1);
	weatherStation.setTemperature(26);
}
}
