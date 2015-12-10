package org.shawnana.headfirst.designpattern.ch6;

import org.shawnana.headfirst.designpattern.ch6.commands.Command;

public class SimpleRemoteControl {
	Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}

	public void buttonWasPressed() {
		command.execute();
	}

	
}
