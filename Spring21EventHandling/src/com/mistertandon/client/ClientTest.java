package com.mistertandon.client;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mistertandon.model.Message;

public class ClientTest {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableBeanFactoryObj = new ClassPathXmlApplicationContext("Beans.xml");

		configurableBeanFactoryObj.start();

		Message messageObj = configurableBeanFactoryObj.getBean("MessageBC", Message.class);

		System.out.println("\n==========================================\n");
		System.out.println("Message Id: " + messageObj.getId());
		System.out.println("Message Content: " + messageObj.getContent());

		configurableBeanFactoryObj.stop();
		configurableBeanFactoryObj.close();
	}

}
