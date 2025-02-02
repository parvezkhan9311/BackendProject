package com.example.book.ticket.app;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.book.ticket.app.entity.Ticket;
import com.example.book.ticket.app.service.TicketBookingService;

@SpringBootApplication
public class TicketManagementBookingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketManagementBookingAppApplication.class, args);
		 
		 /*
		 * //ConfigurableApplicationContext
		 * configurableApplicationContext=SpringApplication.run(
		 * TicketManagementBookingAppApplication.class, args);
		 * TicketBookingService
		 * ticketBookingService=configurableApplicationContext.getBean(
		 * "ticketBookingService", TicketBookingService.class);//String: instance of
		 * service class //it will return the ins of service //here we are directly
		 * creating ticket without controller by calling service instance Ticket
		 * ticket=new Ticket(); ticket.setBookingDate(new Date());
		 * ticket.setDestinationStation("Mumbai"); ticket.setSourceStation("Delhi");
		 * ticket.setPassengerName("Parvez"); ticket.setEmail("parvez@dummy.com");
		 * ticketBookingService.createTicket(ticket);
		 */
	}

}
