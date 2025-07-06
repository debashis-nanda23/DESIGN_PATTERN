package com.chain;

//concrete handler class 
public class Level1SupportHandler implements SupportHandler {

	private SupportHandler nextHandler;
	
	@Override
	public void handleRequest(Request request) {
		if(request.getPriority()==Priority.BASIC) {
			System.out.println("Request is handled by Level1 Support Handler");
		}else {
			nextHandler.handleRequest(request);
		}
		
	}

	@Override
	public void setNextHandlerRequest(SupportHandler handler) {
		this.nextHandler=handler;
		
	}

}
