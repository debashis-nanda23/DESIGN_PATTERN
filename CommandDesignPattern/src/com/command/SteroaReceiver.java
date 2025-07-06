package com.command;

public class SteroaReceiver  implements Devices{

	@Override
	public void turnOn() {
		System.out.println("Stero is turned on");
	}

	@Override
	public void turnOff() {
		System.out.println("Stero is tunred off");
	}
	
	public void adjustVolume() {
		System.out.println("Stero volume is adjusted");
	}

}
