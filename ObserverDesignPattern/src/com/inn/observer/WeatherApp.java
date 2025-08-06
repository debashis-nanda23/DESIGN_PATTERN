package com.inn.observer;

public class WeatherApp {

	public static void main(String[] args) {
		
		WeatherStation station=new WeatherStation();
		
		PhoneDisplay phone=new PhoneDisplay();
		TVDisplay tv=new TVDisplay();
		
		station.addObserver(phone);
		station.addObserver(tv);
		
		station.setWeather("Sunny");
	}
}
