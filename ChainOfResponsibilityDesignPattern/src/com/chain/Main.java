package com.chain;

public class Main {
	
	public static void main(String[] args) {
		
		Level1SupportHandler level1=new Level1SupportHandler();
		Level2SupportHandler level2=new Level2SupportHandler();
		Level3SupportHandler level3=new Level3SupportHandler();
		
		//set up the chain
		level1.setNextHandlerRequest(level2);
		level2.setNextHandlerRequest(level3);
		
		Request request1=new Request(Priority.BASIC);
		Request request2=new Request(Priority.INTERMEDIATE);
		Request request3=new Request(Priority.CRITICAL);
		
		//send the request
		level1.handleRequest(request1);
		level1.handleRequest(request2);
		level1.handleRequest(request3);
		
	}

}
