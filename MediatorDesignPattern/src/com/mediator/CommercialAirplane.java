package com.mediator;

//concrete colleague class
public class CommercialAirplane implements Airplane{

	private AirtraficControlTower mediator;
	
	public CommercialAirplane(AirtraficControlTower mediator) {
		this.mediator=mediator;
	}
	
	@Override
	public void requestLanding() {
		mediator.requestLanding(this);
		
	}
	
	@Override
	public void requestTakeOff() {
		mediator.requestTakeeOff(this);
		
	}
	
	@Override
	public void notifiyAirtraficControl(String message) {
		System.out.println("Commercial Airplane: "+message);
		
	}
}
