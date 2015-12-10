package org.shawnana.headfirst.designpattern.ch7.facade;

public class Amplifier {

	public void on() {
		System.out.println("Amplifier is on");
	}

	public void setDvd() {
		System.out.println("Amplifier input device set to Dvd");
	}

	public void setSurroundSound() {
		System.out.println("Amplifier sound effect set to surround");
	}

	public void setVolume(int i) {
		System.out.println("Amplifier volume set to " + i);
	}

}
