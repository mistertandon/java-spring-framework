package com.mistertandon.client;

import org.springframework.beans.BeansException;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mistertandon.model.PerimeterCalculator;

public class ClientTest {

	public static void main(String[] args) {

		AbstractApplicationContext abstractApplicationContextObj = null;

		try {

			abstractApplicationContextObj = new ClassPathXmlApplicationContext("Beans.xml");
			PerimeterCalculator perimeterCalculatorObj = abstractApplicationContextObj.getBean("PerimeterCalculatorBC",
					PerimeterCalculator.class);

			System.out.println("Rectangle perimeter is: " + perimeterCalculatorObj.getPerimeter());
		} catch (BeansException e) {

			e.printStackTrace();
		} finally {

			abstractApplicationContextObj.close();
		}
	}
}
