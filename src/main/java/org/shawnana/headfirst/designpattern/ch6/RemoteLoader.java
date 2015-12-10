package org.shawnana.headfirst.designpattern.ch6;

import org.shawnana.headfirst.designpattern.ch6.commands.CeilingFanOffCommand;
import org.shawnana.headfirst.designpattern.ch6.commands.CeilingFanOnCommand;
import org.shawnana.headfirst.designpattern.ch6.commands.LightOffCommand;
import org.shawnana.headfirst.designpattern.ch6.commands.LightOnCommand;
import org.shawnana.headfirst.designpattern.ch6.receivers.CeilingFan;
import org.shawnana.headfirst.designpattern.ch6.receivers.Light;

public class RemoteLoader {
	public static void main(String[] args) {
		RemoteControl control = new RemoteControl();
		Light livingRoomlight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomlight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomlight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
		CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
		
		control.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		control.setCommand(1, kitchenLightOn, kitchenLightOff);
		control.setCommand(2, ceilingFanOn, ceilingFanOff);
		System.out.println(control);
		
		control.onButtonWasPressed(0);
		control.onButtonWasPressed(1);
		control.offButtonWasPressed(0);
		control.undoButtonWasPressed();
		control.offButtonWasPressed(1);
		control.onButtonWasPressed(2);
		control.offButtonWasPressed(2);
		control.undoButtonWasPressed();
	}
}
