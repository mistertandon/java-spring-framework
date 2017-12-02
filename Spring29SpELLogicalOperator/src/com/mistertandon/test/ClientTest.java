package com.mistertandon.test;

import org.springframework.beans.BeansException;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mistertandon.model.Result;

public class ClientTest {

	public static void main(String[] args) {

		AbstractApplicationContext abstractApplicationContextObj = null;

		try {

			abstractApplicationContextObj = new ClassPathXmlApplicationContext("Beans.xml");
			Result resultObj = abstractApplicationContextObj.getBean("ResultBC", Result.class);

			System.out.println("Result Status: " + resultObj.getResultMessage());
			System.out.println("Is Passed: " + resultObj.getHasPassed());
		} catch (BeansException e) {

			e.printStackTrace();
		} finally {
			abstractApplicationContextObj.close();
		}
	}

}
