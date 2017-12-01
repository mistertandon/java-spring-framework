package com.mistertandon.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mistertandon.model.Ticket;
import com.mistertandon.model.TicketVendingMachine;

public class ClientTest {

	public static void main(String[] args) {

		AbstractApplicationContext abstractApplicationContextObj = new ClassPathXmlApplicationContext("Beans.xml");

		TicketVendingMachine ticketVendingMachineObj = abstractApplicationContextObj.getBean("TicketVendingMachineBC",
				TicketVendingMachine.class);

		Ticket ticketObj = ticketVendingMachineObj.generateTicket();

		System.out.println(ticketObj.printTicket());

		abstractApplicationContextObj.close();
	}

}
