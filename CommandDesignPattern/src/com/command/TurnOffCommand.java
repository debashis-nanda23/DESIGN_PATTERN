package com.command;

public class TurnOffCommand implements Command {

	private Devices device;
	
	
	
	public TurnOffCommand(Devices device) {
		this.device = device;
	}



	@Override
	public void execute() {
		device.turnOff();
	}

}
