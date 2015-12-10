package org.shawnana.headfirst.designpattern.ch6.commands;

import org.shawnana.headfirst.designpattern.ch6.receivers.Light;

public class LightOnCommand implements Command {
	Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.on();
	}

	@Override
	public void undo() {
		light.off();
	}

}
