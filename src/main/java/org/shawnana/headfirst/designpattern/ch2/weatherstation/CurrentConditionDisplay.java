package org.shawnana.headfirst.designpattern.ch2.weatherstation;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {
	private Observable weatherData = null;
	private float temperature;
	private float humidity;
	
	public CurrentConditionDisplay(Observable observable) {
		this.weatherData = observable;
		weatherData.addObserver(this);
	}

	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}

	public void display() {
		System.out.println("Current conditions : " + this.temperature
				+ "F degrees and " + this.humidity + "% humidity.");
	}

}
