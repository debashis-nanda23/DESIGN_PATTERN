package com.mediator;

public class Main {
	
	public static void main(String[] args) {
		
		//instantiate the mediator
		AirtraficControlTower tower=new AirportTraficControlTower();
		
		//instantiate the concrete colleague
		Airplane airplane1=new CommercialAirplane(tower);
		Airplane airplane2=new CommercialAirplane(tower);
		
		//set up the association between concrete colleague and mediator
		airplane1.requestLanding();
		airplane2.requestTakeOff();
	}

}
