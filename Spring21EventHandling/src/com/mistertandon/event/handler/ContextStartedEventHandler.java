package com.mistertandon.event.handler;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class ContextStartedEventHandler implements ApplicationListener<ContextStartedEvent> {

	@Override
	public void onApplicationEvent(ContextStartedEvent arg0) {
		
		System.out.println("\n=====================================");
		System.out.println("ContextStartedEvent recieved...");
		System.out.println("" + arg0.getSource());
	}

}
