package com.mistertandon.client;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mistertandon.model.Message;
import com.sun.xml.internal.ws.Closeable;

public class ClientTest {

	public static void main(String[] args) {

		ApplicationContext applicationContextObj = null;

		try {
			applicationContextObj = new ClassPathXmlApplicationContext("Beans.xml");
			Message messageObj = applicationContextObj.getBean("message", Message.class);

			System.out.println("Case A: How we can access Bean XML properties (Scope defined as Singleton) ->");

			System.out.println("Property MessageId value: " + messageObj.getMessageId());
			System.out.println("Property Message value: " + messageObj.getMessage());

		} catch (BeansException e) {

			e.printStackTrace();
		} finally {

			((AbstractApplicationContext) applicationContextObj).close();
		}
	}

}
