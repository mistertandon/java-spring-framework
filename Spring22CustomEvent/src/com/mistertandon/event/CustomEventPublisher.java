package com.mistertandon.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomEventPublisher implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher applicationEventPublisherObj;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisherObj) {

		this.applicationEventPublisherObj = applicationEventPublisherObj;
	}

	public void publishEvent() {

		CustomEvent customEventObj = new CustomEvent(this);

		applicationEventPublisherObj.publishEvent(customEventObj);
	}
}
