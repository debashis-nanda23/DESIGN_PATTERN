package com.mediator;

//mediator interface
public interface AirtraficControlTower {

	void requestTakeeOff(Airplane airplane);
	void requestLanding(Airplane airplane);
}
