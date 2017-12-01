package com.mistertandon.client;

import org.springframework.beans.BeansException;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mistertandon.model.Course;
import com.mistertandon.model.Student;

public class ClientTest {

	public static void main(String[] args) {

		AbstractApplicationContext abstractApplicationContextObj = null;

		try {

			abstractApplicationContextObj = new ClassPathXmlApplicationContext("Beans.xml");

			Student StudentObj = abstractApplicationContextObj.getBean("StudentBC", Student.class);

			System.out.println("Student Name: " + StudentObj.getName());
			System.out.println("Student Age: " + StudentObj.getAge());

			Course courseObj = StudentObj.getCourseObj();

			System.out.println("Course Name: " + courseObj.getName());

		} catch (BeansException e) {

			e.printStackTrace();
		} finally {

			abstractApplicationContextObj.close();
		}

	}

}
