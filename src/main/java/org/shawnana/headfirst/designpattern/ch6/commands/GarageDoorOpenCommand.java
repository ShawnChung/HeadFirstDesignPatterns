package org.shawnana.headfirst.designpattern.ch6.commands;

import org.shawnana.headfirst.designpattern.ch6.receivers.GarageDoor;

public class GarageDoorOpenCommand implements Command {
	GarageDoor door;
	
	public GarageDoorOpenCommand(GarageDoor door) {
		this.door = door;
	}
	
	@Override
	public void execute() {
		door.open();
	}

	@Override
	public void undo() {
		door.close();
	}

}
