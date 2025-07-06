package com.command;

public class TVReceiver implements Devices {

	@Override
	public void turnOn() {
		System.out.println("TV is turned on");
	}

	@Override
	public void turnOff() {
		System.out.println("TV is turned off");
	}
	
	public void changeChannel() {
		System.out.println("Channel is changed");
	}

}
