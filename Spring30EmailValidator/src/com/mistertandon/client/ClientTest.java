package com.mistertandon.client;

import org.springframework.beans.BeansException;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mistertandon.model.EmailValidator;

public class ClientTest {

	public static void main(String[] args) {

		AbstractApplicationContext abstractApplicationContextObj = null;
		try {
			abstractApplicationContextObj = new ClassPathXmlApplicationContext("Beans.xml");

			EmailValidator emailValidatorObj = abstractApplicationContextObj.getBean("EmailValidatorBC",
					EmailValidator.class);
			System.out.println("Is Student Email Invalid: " + emailValidatorObj.getIsValidEmail());

		} catch (BeansException e) {

			e.printStackTrace();
		} finally {
			abstractApplicationContextObj.close();
		}

	}

}
