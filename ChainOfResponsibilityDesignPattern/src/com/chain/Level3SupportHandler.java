package com.chain;

//concrete handler class 
public class Level3SupportHandler implements SupportHandler {

	
	
	@Override
	public void handleRequest(Request request) {
		if(request.getPriority()==Priority.CRITICAL) {
			System.out.println("Request is handled by level3 support handler");
		}else {
			System.out.println("Request can not be handled");
		}
		
	}

	@Override
	public void setNextHandlerRequest(SupportHandler handler) {
		// TODO Auto-generated method stub
		
	}

}
