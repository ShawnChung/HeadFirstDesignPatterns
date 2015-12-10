package org.shawnana.headfirst.designpattern.ch7.facade;

public class HomeTheaterFacade {
	final Amplifier amp;
	final Tuner tuner;
	final DvdPlayer dvdPlayer;
	final CdPlayer cdPlayer;
	final Projecter projecter;
	final TheaterLights lights;
	final Screen screen;
	final PopcornPoper popper;
	
	public HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dvdPlayer,
			CdPlayer cdPlayer, Projecter projecter, TheaterLights lights,
			Screen screen, PopcornPoper popper) {
		this.amp = amp;
		this.tuner = tuner;
		this.dvdPlayer = dvdPlayer;
		this.cdPlayer = cdPlayer;
		this.projecter = projecter;
		this.lights = lights;
		this.screen = screen;
		this.popper = popper;
	}
	
	public void watchMovie(String movie) {
		System.out.println("Get ready to watch a movie...");
		popper.on();
		popper.pop();
		lights.dim(10);
		screen.down();
		projecter.on();
		projecter.wideScreenMode();
		amp.on();
		amp.setDvd();
		amp.setSurroundSound();
		amp.setVolume(5);
		dvdPlayer.on();
		dvdPlayer.play(movie);
	}
	
	public static void main(String[] args) {
		HomeTheaterFacade facade = new HomeTheaterFacade(new Amplifier(),
				new Tuner(), new DvdPlayer(), new CdPlayer(), new Projecter(),
				new TheaterLights(), new Screen(), new PopcornPoper());
		facade.watchMovie("Gone with the wind");
	}
}
