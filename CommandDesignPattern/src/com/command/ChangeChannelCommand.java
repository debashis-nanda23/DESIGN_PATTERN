package com.command;

public class ChangeChannelCommand implements Command{

	private TVReceiver tv;
	
	public ChangeChannelCommand(TVReceiver tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.changeChannel();
	}

}
