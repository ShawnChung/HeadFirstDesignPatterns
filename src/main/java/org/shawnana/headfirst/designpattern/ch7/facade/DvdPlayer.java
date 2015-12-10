package org.shawnana.headfirst.designpattern.ch7.facade;

public class DvdPlayer {

	public void on() {
		System.out.println("DvdPlay is on");
	}

	public void play(String movie) {
		System.out.println("DvdPlay is playing movie " + movie);
	}

}
