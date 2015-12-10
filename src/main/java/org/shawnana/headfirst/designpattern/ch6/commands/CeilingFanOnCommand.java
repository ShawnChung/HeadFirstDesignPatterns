package org.shawnana.headfirst.designpattern.ch6.commands;

import org.shawnana.headfirst.designpattern.ch6.receivers.CeilingFan;


public class CeilingFanOnCommand implements Command {
	CeilingFan fan;
	
	public CeilingFanOnCommand(CeilingFan fan) {
		this.fan = fan;
	}
	
	@Override
	public void execute() {
		fan.on();
	}

	@Override
	public void undo() {
		fan.off();
	}

}
