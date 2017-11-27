package com.mistertandon.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.mistertandon.model.Message;

public class ClienTest {

	public static void main(String[] args) {

		Resource resourceObj = new ClassPathResource("Beans.xml");
		BeanFactory beanFactoryObj = new XmlBeanFactory(resourceObj);

		System.out.println("Case A: How we can access Bean XML properties ->");

		Object object = beanFactoryObj.getBean("message");

		if (object != null) {

			Message messageObj = (Message) object;

			System.out.println("Property MessageId value: " + messageObj.getMessageId());
			System.out.println("Property Message value: " + messageObj.getMessage());
		}

		System.out.println("\n===========================================================\n");
		System.out.println("Case B: How we can access Bean XML properties ->");

		Message messageObjA = beanFactoryObj.getBean("message", Message.class);

		System.out.println("Property MessageId value: " + messageObjA.getMessageId());
		System.out.println("Property Message value: " + messageObjA.getMessage());

		System.out.println("\n===========================================================\n");
		System.out.println("Case C: How we can access Bean XML properties ->");

		Message messageObjB = beanFactoryObj.getBean(Message.class);

		System.out.println("Property MessageId value: " + messageObjB.getMessageId());
		System.out.println("Property Message value: " + messageObjB.getMessage());

		System.out.println("\n===========================================================\n");
		System.out.println("Case D: How to get Aliases array ->");

		String[] messageAliases = beanFactoryObj.getAliases("message");

		for (String beanAliasName : messageAliases) {

			System.out.println("Alias Name: " + beanAliasName);
		}

		System.out.println("\n===========================================================\n");
		System.out.println("Case E: How to get Class Type ->");

		Class<?> classType = beanFactoryObj.getType("message");
		System.out.println("Class Type is: " + classType.getName());

		System.out.println("\n===========================================================\n");
		System.out.println("Case F: How to Check is Bean Singleton or not ->");

		System.out.println("Is Bean Singleton: " + beanFactoryObj.isSingleton("message"));
	}

}
