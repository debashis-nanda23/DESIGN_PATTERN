package com.mediator;

public class AirportTraficControlTower implements AirtraficControlTower {

	@Override
	public void requestTakeeOff(Airplane airplane) {
		airplane.notifiyAirtraficControl("Requestng take off clearance");
		
	}

	@Override
	public void requestLanding(Airplane airplane) {
		airplane.notifiyAirtraficControl("Requesting landing clearance");
		
	}

}
