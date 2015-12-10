package org.shawnana.headfirst.designpattern.ch6.commands;

import org.shawnana.headfirst.designpattern.ch6.receivers.GarageDoor;

public class GarageDoorCloseCommand implements Command {
	GarageDoor door;
	
	public GarageDoorCloseCommand(GarageDoor door) {
		this.door = door;
	}
	
	@Override
	public void execute() {
		door.close();
	}

	@Override
	public void undo() {
		door.open();
	}

}
