package com.mistertandon.client;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mistertandon.model.BooKlibrary;
import com.mistertandon.model.Book;

public class ClientTest {

	public static void main(String[] args) {

		AbstractApplicationContext abstractApplicationContextObj = null;

		try {

			abstractApplicationContextObj = new ClassPathXmlApplicationContext("Beans.xml");

			BooKlibrary booKlibraryObj = abstractApplicationContextObj.getBean("BooKlibraryBC", BooKlibrary.class);

			List<Book> allBooks = booKlibraryObj.getAllBookList();

			for (Book bookObj : allBooks) {

				System.out.println("\nBook Id: " + bookObj.getId());
				System.out.println("Book Name: " + bookObj.getName());
			}

			System.out.println("\n=======================================================");

			Book bookObjB = booKlibraryObj.getGetFirstBook();
			System.out.println("\nFirst Book Id: " + bookObjB.getId());
			System.out.println("First Book Name: " + bookObjB.getName());

		} catch (BeansException e) {

			e.printStackTrace();
		} finally {
			abstractApplicationContextObj.close();
		}

	}

}
