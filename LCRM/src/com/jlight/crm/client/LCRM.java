package com.jlight.crm.client;

import com.google.gwt.core.client.EntryPoint;


/**
 * 入口
 */
public class LCRM implements EntryPoint {


//  private final GreetingServiceAsync greetingService = GWT.create( GreetingService.class );

  public void onModuleLoad() {
    new LoginPage().display();
  }
}
