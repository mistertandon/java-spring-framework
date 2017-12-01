package com.mistertandon.event;

import org.springframework.context.ApplicationListener;

public class CustomEventHandler implements ApplicationListener<CustomEvent> {

	@Override
	public void onApplicationEvent(CustomEvent customEventObj) {

		System.out.println(customEventObj.toString());
	}

}
