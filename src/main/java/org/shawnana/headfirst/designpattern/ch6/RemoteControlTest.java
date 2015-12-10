package org.shawnana.headfirst.designpattern.ch6;

import org.shawnana.headfirst.designpattern.ch6.commands.GarageDoorOpenCommand;
import org.shawnana.headfirst.designpattern.ch6.commands.LightOnCommand;
import org.shawnana.headfirst.designpattern.ch6.receivers.GarageDoor;
import org.shawnana.headfirst.designpattern.ch6.receivers.Light;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl control = new SimpleRemoteControl();
		Light light = new Light("");
		LightOnCommand lightOn = new LightOnCommand(light);
		control.setCommand(lightOn);
		control.buttonWasPressed();
		
		GarageDoor door = new GarageDoor("");
		GarageDoorOpenCommand doorOpen = new GarageDoorOpenCommand(door);
		control.setCommand(doorOpen);
		control.buttonWasPressed();
	}
}
