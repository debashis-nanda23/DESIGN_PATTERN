package com.chain;

//handler interface
public interface SupportHandler {
   void handleRequest(Request request);
   void setNextHandlerRequest(SupportHandler handler);
}

