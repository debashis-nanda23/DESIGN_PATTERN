package com.command;

public class Main {
	
	public static void main(String[] args) {
		
		//create devices
		TVReceiver tv=new TVReceiver();
		SteroaReceiver stereo=new SteroaReceiver();
		
		//create command object
		Command turnOnCommand=new TurnOnCommand(tv);
		Command turnOffCommand=new TurnOffCommand(tv);
		Command adjustVolumeCommand=new AdjustVolumeCommand(stereo);
		Command changeChannelCommand=new ChangeChannelCommand(tv);
		
		//create Remote Control
		RemoteControl remote=new RemoteControl();
		
		//set and execute the command
		remote.setCommand(turnOnCommand);
		remote.pressButton();
		
		remote.setCommand(adjustVolumeCommand);
		remote.pressButton();
		
		remote.setCommand(changeChannelCommand);
		remote.pressButton();
		
		remote.setCommand(turnOffCommand);
		remote.pressButton();
		
		
		
		
	}

}
