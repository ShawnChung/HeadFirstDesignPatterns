package org.shawnana.headfirst.designpattern.ch6;

import org.shawnana.headfirst.designpattern.ch6.commands.CeilingFanOffCommand;
import org.shawnana.headfirst.designpattern.ch6.commands.CeilingFanOnCommand;
import org.shawnana.headfirst.designpattern.ch6.commands.Command;
import org.shawnana.headfirst.designpattern.ch6.commands.GarageDoorCloseCommand;
import org.shawnana.headfirst.designpattern.ch6.commands.GarageDoorOpenCommand;
import org.shawnana.headfirst.designpattern.ch6.commands.LightOffCommand;
import org.shawnana.headfirst.designpattern.ch6.commands.LightOnCommand;
import org.shawnana.headfirst.designpattern.ch6.commands.MacroCommand;
import org.shawnana.headfirst.designpattern.ch6.receivers.CeilingFan;
import org.shawnana.headfirst.designpattern.ch6.receivers.GarageDoor;
import org.shawnana.headfirst.designpattern.ch6.receivers.Light;

public class MacroCommandTest {
	public static void main(String[] args) {
		RemoteControl control = new RemoteControl();
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		GarageDoor door = new GarageDoor("");
		
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
		CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
		
		GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(door);
		GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(door);
		
		Command[] partyOn = {kitchenLightOn, ceilingFanOn, garageDoorOpen};
		Command[] partyOff = {kitchenLightOff, ceilingFanOff, garageDoorClose};
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
		control.setCommand(0, partyOnMacro, partyOffMacro);
		control.onButtonWasPressed(0);
	}
}
