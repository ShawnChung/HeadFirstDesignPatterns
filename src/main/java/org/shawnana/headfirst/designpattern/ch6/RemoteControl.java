package org.shawnana.headfirst.designpattern.ch6;

import org.shawnana.headfirst.designpattern.ch6.commands.Command;
import org.shawnana.headfirst.designpattern.ch6.commands.NoCommand;

public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;
	
	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		NoCommand noCommand = new NoCommand();
		
		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		if (slot >= onCommands.length)
			throw new ArrayIndexOutOfBoundsException();
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPressed(int slot) {
		if (slot >= onCommands.length)
			throw new ArrayIndexOutOfBoundsException();
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
	
	public void offButtonWasPressed(int slot) {
		if (slot >= offCommands.length)
			throw new ArrayIndexOutOfBoundsException();
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	public void undoButtonWasPressed() {
		undoCommand.undo();
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n------ Remote Control ------\n");
		for (int i = 0; i < onCommands.length; i++) {
			builder.append("[slot").append(i).append("]").append(onCommands[i].getClass().getSimpleName());
			builder.append("     ").append(offCommands[i].getClass().getSimpleName()).append("\n");
		}
		return builder.toString();
	}
}
