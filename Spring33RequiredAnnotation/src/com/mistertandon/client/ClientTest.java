package com.mistertandon.client;

import org.springframework.beans.BeansException;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mistertandon.model.Message;

public class ClientTest {

	public static void main(String[] args) {

		AbstractApplicationContext abstractApplicationContextObj = null;

		try {

			abstractApplicationContextObj = new ClassPathXmlApplicationContext("Beans.xml");

			Message messageObj = abstractApplicationContextObj.getBean("MessageBC", Message.class);

			System.out.println("\nHow @Required annotation works in SPRING\n");
			System.out.println("Message ID: " + messageObj.getId());
			System.out.println("Message content: " + messageObj.getContent());
		} catch (BeansException e) {

			e.printStackTrace();
		} finally {

			abstractApplicationContextObj.close();
		}
	}

}
