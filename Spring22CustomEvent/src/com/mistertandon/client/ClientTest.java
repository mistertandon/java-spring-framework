package com.mistertandon.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mistertandon.event.CustomEventPublisher;

public class ClientTest {

	public static void main(String[] args) {

		AbstractApplicationContext abstractApplicationContextObj = new ClassPathXmlApplicationContext("Beans.xml");

		CustomEventPublisher customEventPublisherObj = abstractApplicationContextObj.getBean("CustomEventPublisherBC",
				CustomEventPublisher.class);

		customEventPublisherObj.publishEvent();
		abstractApplicationContextObj.close();
	}

}
