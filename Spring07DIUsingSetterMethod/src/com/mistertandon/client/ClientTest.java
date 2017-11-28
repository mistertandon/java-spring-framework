package com.mistertandon.client;

import org.springframework.beans.BeansException;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mistertandon.message.Messaging;
import com.mistertandon.service.Communication;

public class ClientTest {

	public static void main(String[] args) {

		AbstractApplicationContext applicationContextObj = null;

		try {

			applicationContextObj = new ClassPathXmlApplicationContext("Beans.xml");

			Communication communicationObj = applicationContextObj.getBean("CommunicationId", Communication.class);

			communicationObj.communicate();
		} catch (BeansException e) {

			e.printStackTrace();
		} finally {

			applicationContextObj.close();
		}
	}

}
