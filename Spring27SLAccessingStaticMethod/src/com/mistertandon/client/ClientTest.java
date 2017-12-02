package com.mistertandon.client;

import org.springframework.beans.BeansException;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mistertandon.model.RandomNumberGenerator;

public class ClientTest {

	public static void main(String[] args) {

		AbstractApplicationContext abstractApplicationContextObj = null;

		try {

			abstractApplicationContextObj = new ClassPathXmlApplicationContext("Beans.xml");
			RandomNumberGenerator randomNumberGeneratorObj = abstractApplicationContextObj
					.getBean("RandomNumberGeneratorBC", RandomNumberGenerator.class);

			System.out.println("Random Number: " + randomNumberGeneratorObj.getRandomNumber());
			System.out.println("Value of PI: " + randomNumberGeneratorObj.getPi());

		} catch (BeansException e) {

			e.printStackTrace();
		} finally {
			abstractApplicationContextObj.close();
		}

	}

}
