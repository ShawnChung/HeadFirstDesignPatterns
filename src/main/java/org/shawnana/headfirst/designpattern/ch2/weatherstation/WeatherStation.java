package org.shawnana.headfirst.designpattern.ch2.weatherstation;

import java.util.Observable;

public class WeatherStation {
	public static void main(String[] args) {
		Observable weatherData = new WeatherData();
		@SuppressWarnings("unused")
		CurrentConditionDisplay currentDisplay = 
				new CurrentConditionDisplay(weatherData);
		((WeatherData)weatherData).setMeasurements(80, 65, 30.4f);
		((WeatherData)weatherData).setMeasurements(82, 70, 29.2f);
		((WeatherData)weatherData).setMeasurements(78, 90, 29.2f);
	}
}
