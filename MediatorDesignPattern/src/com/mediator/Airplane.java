package com.mediator;

//colleague interface
public interface Airplane {
   void requestTakeOff();
   void requestLanding();
   void notifiyAirtraficControl(String message);
}
