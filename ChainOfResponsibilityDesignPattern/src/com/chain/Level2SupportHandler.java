package com.chain;

//concrete handler class 
public class Level2SupportHandler implements SupportHandler{

	private SupportHandler nextHandler;
	@Override
	public void handleRequest(Request request) {
		if(request.getPriority()==Priority.INTERMEDIATE) {
			System.out.println("Request is handled by Level2 Support Handler");
		}else {
			nextHandler.handleRequest(request);
		}
		
		
	}

	@Override
	public void setNextHandlerRequest(SupportHandler handler) {
		this.nextHandler=handler;
		
	}

}
