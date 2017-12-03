package com.mistertandon.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mistertandon.model.TelephoneDirectoryAccessor;

public class ClientTest {

	public static void main(String[] args) {

		AbstractApplicationContext abstractApplicationContextObj = null;
		abstractApplicationContextObj = new ClassPathXmlApplicationContext("Beans.xml");

		TelephoneDirectoryAccessor telephoneDirectoryAccessorObj = abstractApplicationContextObj
				.getBean("TelephoneDirectoryAccessorBC", TelephoneDirectoryAccessor.class);

		System.out.println("\nPerson number: " + telephoneDirectoryAccessorObj.getTelephoneNumber());

		abstractApplicationContextObj.close();
	}

}
