package com.command;

public class AdjustVolumeCommand  implements Command{

	private SteroaReceiver stereo;
	
	public AdjustVolumeCommand(SteroaReceiver stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.adjustVolume();
	}

}
