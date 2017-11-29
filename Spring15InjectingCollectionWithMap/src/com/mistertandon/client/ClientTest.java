package com.mistertandon.client;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mistertandon.info.CompanyInfo;
import com.mistertandon.model.Student;

public class ClientTest {

	public static void main(String[] args) {

		AbstractApplicationContext abstractApplicationContextObj = new ClassPathXmlApplicationContext("Beans.xml");
		CompanyInfo companyInfoObj = abstractApplicationContextObj.getBean("CompanyInfoBC", CompanyInfo.class);

		System.out.println("\n===============================================================================");
		System.out.println("Now we'll access and print Map<Integer, String> type variable value.");

		Map<Integer, String> empIdAndNameMap = companyInfoObj.getEmpIdAndNameMap();
		Set<Entry<Integer, String>> entrySetObj_A = empIdAndNameMap.entrySet();

		for (Entry<Integer, String> entryObj : entrySetObj_A) {

			System.out.println("Student ID: " + entryObj.getKey() + " AND Student Name: " + entryObj.getValue());
		}

		System.out.println("\n===============================================================================");
		System.out.println("Now we'll access and print Map<Integer, Student> type variable value.");

		Map<Integer, Student> empIdMap = companyInfoObj.getStudentIdMap();
		Set<Entry<Integer, Student>> entrySetObj_B = empIdMap.entrySet();

		Student studentObj = null;
		for (Entry<Integer, Student> entryObj : entrySetObj_B) {

			studentObj = entryObj.getValue();
			System.out.println("Student ID: " + entryObj.getKey() + ", Name: " + studentObj.getStudentName()
					+ " Email ID: " + studentObj.getStudentEmail() + ", Gender: " + studentObj.getStudentGender());

		}
	}

}
