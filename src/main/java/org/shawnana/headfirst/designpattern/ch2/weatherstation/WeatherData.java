package org.shawnana.headfirst.designpattern.ch2.weatherstation;

import java.util.Observable;

public class WeatherData extends Observable {
	private float temperature;
	private float humidity;
	private float pressure;
	
	public void setMeasurements(int t, int h, float p) {
		this.setTemperature(t);
		this.setHumidity(h);
		this.setPressure(p);
		measurementsChanged();
	}

	public void measurementsChanged() {
		setChanged();
		this.notifyObservers();
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
}
