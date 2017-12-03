package com.mistertandon.client;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mistertandon.model.Student;
import com.mistertandon.model.StudentListAccessor;

public class ClientTest {

	public static void main(String[] args) {

		AbstractApplicationContext abstractApplicationContextObj;

		abstractApplicationContextObj = new ClassPathXmlApplicationContext("Beans.xml");

		StudentListAccessor studentListAccessorObj = abstractApplicationContextObj.getBean("StudentListAccessorBC",
				StudentListAccessor.class);

		Student thirdStudentObj = studentListAccessorObj.getThirdStudentInList();

		System.out.println(
				"Student name at 3 index: " + thirdStudentObj.getName() + ", AND marks: " + thirdStudentObj.getMarks());

		System.out.println("\n=================================================================================\n");
		System.out.println("\nFailed Students list\n");

		List<Student> failedStudentList = studentListAccessorObj.getFailedStudent();

		for (Student studentObj : failedStudentList) {

			System.out.println("Student name: " + studentObj.getName() + ", having marks:" + studentObj.getMarks());
		}

		System.out.println("\n=================================================================================\n");
		System.out.println("\nStudents list\n");

		List<String> studentList = studentListAccessorObj.getStudentNames();

		for (String studentName : studentList) {

			System.out.println("Student name: " + studentName);
		}
		abstractApplicationContextObj.close();

	}

}
