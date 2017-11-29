package com.mistertandon.client;

import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.BeansException;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mistertandon.model.UserInfo;

public class ClientTest {

	public static void main(String[] args) {

		AbstractApplicationContext abstractApplicationContextObj = null;

		try {
			abstractApplicationContextObj = new ClassPathXmlApplicationContext("Beans.xml");

			UserInfo userInfoObj = abstractApplicationContextObj.getBean("UserInfoBC", UserInfo.class);
			Properties userPropertiesObj = userInfoObj.getUserInfo();

			Set<Entry<Object, Object>> userPropSet = userPropertiesObj.entrySet();

			for (Entry<Object, Object> userPropEntry : userPropSet) {

				System.out.println("Key: " + userPropEntry.getKey() + ", value: " + userPropEntry.getValue());
			}

		} catch (BeansException e) {

			e.printStackTrace();
		} finally {

			abstractApplicationContextObj.close();
		}

	}

}
