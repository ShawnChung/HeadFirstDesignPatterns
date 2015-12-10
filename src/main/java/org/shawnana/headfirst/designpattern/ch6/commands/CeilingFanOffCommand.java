package org.shawnana.headfirst.designpattern.ch6.commands;

import org.shawnana.headfirst.designpattern.ch6.receivers.CeilingFan;

public class CeilingFanOffCommand implements Command {
	CeilingFan fan;
	
	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.fan = ceilingFan;
	}

	@Override
	public void execute() {
		fan.off();
	}

	@Override
	public void undo() {
		fan.on();
	}

}
