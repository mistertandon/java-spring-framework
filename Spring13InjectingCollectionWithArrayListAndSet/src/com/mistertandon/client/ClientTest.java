package com.mistertandon.client;

import org.springframework.beans.BeansException;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mistertandon.info.OrgInfo;

public class ClientTest {

	public static void main(String[] args) {

		AbstractApplicationContext abstractApplicationContextObj = null;
		try {
			abstractApplicationContextObj = new ClassPathXmlApplicationContext("Beans.xml");

			OrgInfo orgInfoBCObj = abstractApplicationContextObj.getBean("OrgInfoBC", OrgInfo.class);

			for (String name : orgInfoBCObj.getNameArr()) {

				System.out.println("Person Name: " + name);
			}

			for (String empName : orgInfoBCObj.getEmpNameList()) {

				System.out.println("Employee Name: " + empName);
			}
			for (int empId : orgInfoBCObj.getEmpIdSet()) {

				System.out.println("Employee Id: " + empId);
			}
		} catch (BeansException e) {

			e.printStackTrace();
		} finally {

			abstractApplicationContextObj.close();
		}
	}

}
