package com.mistertandon.client;

import org.springframework.beans.BeansException;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mistertandon.model.Employee;
import com.mistertandon.model.PanCard;

public class ClientTest {

	public static void main(String[] args) {

		AbstractApplicationContext asbstractApplicationContextObj = null;
		Boolean isEmpRecordExist = false;
		Boolean isEmpPanCardExist = false;

		try {
			asbstractApplicationContextObj = new ClassPathXmlApplicationContext("Beans.xml");

			Employee employeeObj = asbstractApplicationContextObj.getBean("EmployeeBC", Employee.class);

			isEmpRecordExist = employeeObj == null ? false : true;

			if (isEmpRecordExist) {

				System.out.println("Employee ID: " + employeeObj.getEmployeeId());
				System.out.println("Employee Name: " + employeeObj.getEmployeeName());
				System.out.println("Employee Email ID: " + employeeObj.getEmployeeEmail());
			}

			PanCard panCardObj = employeeObj.getPanCard();
			isEmpPanCardExist = panCardObj == null ? false : true;

			if (isEmpRecordExist && isEmpPanCardExist) {

				System.out.println("\nPanCard number: " + panCardObj.getPanNumber());
				System.out.println("PanCard holder name: " + panCardObj.getPanHolderName());
			}

		} catch (BeansException e) {

			e.printStackTrace();
		} finally {

			asbstractApplicationContextObj.close();
		}

	}

}
