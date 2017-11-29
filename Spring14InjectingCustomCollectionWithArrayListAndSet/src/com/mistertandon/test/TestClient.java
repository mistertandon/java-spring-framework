package com.mistertandon.test;

import org.springframework.beans.BeansException;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mistertandon.info.OrgInfo;
import com.mistertandon.model.Student;

public class TestClient {

	public static void main(String[] args) {

		AbstractApplicationContext abstractApplicationContextObj = null;

		try {

			abstractApplicationContextObj = new ClassPathXmlApplicationContext("Beans.xml");

			OrgInfo orgInfoObj = abstractApplicationContextObj.getBean("OrgInfoBC", OrgInfo.class);

			System.out.println("================================================");
			System.out.println("\nStudent info stored in of data type Student[] ");
			for (Student studentObj : orgInfoObj.getStudentArr()) {

				System.out.println("Student id is: " + studentObj.getStudentId());
				System.out.println("Student name is: " + studentObj.getStudentName());
				System.out.println("Student emailIs is: " + studentObj.getEmailId());
				System.out.println("Student gender is: " + studentObj.getGender());
			}

			System.out.println("================================================");
			System.out.println("\nStudent info stored in of data type List<Student> ");
			for (Student studentObj : orgInfoObj.getStudentList()) {

				System.out.println("Student id is: " + studentObj.getStudentId());
				System.out.println("Student name is: " + studentObj.getStudentName());
				System.out.println("Student emailIs is: " + studentObj.getEmailId());
				System.out.println("Student gender is: " + studentObj.getGender());
			}

			System.out.println("================================================");
			System.out.println("\nStudent info stored in of data type Set<Student> ");
			for (Student studentObj : orgInfoObj.getStudentSet()) {

				System.out.println("Student id is: " + studentObj.getStudentId());
				System.out.println("Student name is: " + studentObj.getStudentName());
				System.out.println("Student emailIs is: " + studentObj.getEmailId());
				System.out.println("Student gender is: " + studentObj.getGender());
			}
		} catch (BeansException e) {

			e.printStackTrace();
		} finally {
			abstractApplicationContextObj.close();
		}
	}

}
