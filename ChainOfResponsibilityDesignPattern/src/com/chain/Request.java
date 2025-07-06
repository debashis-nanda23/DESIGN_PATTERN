package com.chain;

public class Request {
	
	private Priority priority;

	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	public Request(Priority priority) {
		super();
		this.priority = priority;
	}
	
	

}
