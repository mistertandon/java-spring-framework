package com.mistertandon.event.handler;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class ContextStoppedEventHandler implements ApplicationListener<ContextStoppedEvent> {

	@Override
	public void onApplicationEvent(ContextStoppedEvent arg0) {

		System.out.println("\n=====================================");
		System.out.println("ContextStoppedEvent recieved...");
		System.out.println("" + arg0.getSource());
	}

}
