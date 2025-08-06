package com.inn.observer;

import java.util.ArrayList;
import java.util.List;

//concrete subject
public class WeatherStation implements Subject {

	private List<Observer> observers=new ArrayList<>();
	private String weather;
	
	@Override
	public void addObserver(Observer observer) {
		this.observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
	   this.observers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for(Observer observer:this.observers) {
			observer.update(weather);
		}
	}
	
	public void setWeather(String newWeather) {
		this.weather=newWeather;
		notifyObserver();
	}

	
	
}
