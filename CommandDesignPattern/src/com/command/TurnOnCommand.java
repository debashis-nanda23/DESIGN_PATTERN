package com.command;

public class TurnOnCommand implements Command {

	private Devices device;
	
	
	public TurnOnCommand(Devices device) {
		this.device = device;
	}


	@Override
	public void execute() {
		device.turnOn();
	}

}
