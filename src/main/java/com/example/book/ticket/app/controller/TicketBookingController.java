package com.example.book.ticket.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.book.ticket.app.entity.Ticket;
import com.example.book.ticket.app.service.TicketBookingService;

@RestController
@RequestMapping(value="/api/tickets")
public class TicketBookingController {
	
@Autowired 	
private TicketBookingService ticketBookingService;//our controller depends on Service class so auto wired annotation	
//to write/create any resource to server
//http://localhost:8080/api/tickets/create
@PostMapping(value="/create")
public Ticket createTicket(@RequestBody Ticket ticket) {//req body will convert wahtever json data we are sending
														//to server into JAVA object
	
	return ticketBookingService.createTicket(ticket); 	
}
//To read any resource from server
@GetMapping(value="/ticket/{ticketId}")
public Optional<Ticket> getTicketById(@PathVariable("ticketId") Integer ticketId) {//Path var--{ticket Id}
return	ticketBookingService.getTicketById(ticketId);
	}
//http://localhost:8080/api/tickets/alltickets
@GetMapping(value="/alltickets")
public Iterable<Ticket> getAllBookedTickets(){
	return ticketBookingService.getAllBookedTickets();
	
}

@DeleteMapping(value="/ticket/{ticketId}")
public void deleteTicket(@PathVariable("ticketId") Integer ticketId) {
	ticketBookingService.deleteTicket(ticketId);
	}
//to update resource on server
@PutMapping(value="/ticket/{ticketId}/{newEmail:.+}")//.+-->to handle email add. after (.gmail) need to use (.+) inside PV
public Ticket updateTicket(@PathVariable("ticketId") Integer ticketId, 
							@PathVariable("newEmail") String newEmail) {
	
	return ticketBookingService.updateTicket(ticketId, newEmail);
	
	
	
}

	
}
