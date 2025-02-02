package com.example.book.ticket.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.book.ticket.app.entity.Ticket;
import com.example.book.ticket.app.repository.TicketBookingRepository;

@Service
public class TicketBookingService {//This class has dependency on Dao Layer          /Repository
	
	@Autowired
	private TicketBookingRepository ticketBookingRepository;
	
	public Ticket createTicket(Ticket ticket) {
		return ticketBookingRepository.save(ticket);
	}
	
	public Optional<Ticket> getTicketById(Integer ticketId) {
		return ticketBookingRepository.findById(ticketId);
	}

	public Iterable<Ticket> getAllBookedTickets() {
		return ticketBookingRepository.findAll();
	}

	public void deleteTicket(Integer ticketId) {
		ticketBookingRepository.deleteById(ticketId);
	}

	public Ticket updateTicket(Integer ticketId, String newEmail) {
		//Optional<Ticket> ticket= ticketBookingRepository.findById(ticketId);//findById is having Optional class as return type
																			//then how we will use setter method for email
															//to set email as Optional doesn't have setter for any parameter
		/*
		 * public Ticket updateTicket(Integer ticketId, String newEmail) {
		 * Optional<Ticket> ticket= ticketBookingRepository.findById(ticketId);
		 * ticket.setEmail???? }
		 */
		Optional<Ticket> ticket = ticketBookingRepository.findById(ticketId);

			Ticket ticketFromDB = ticket.get();
			ticketFromDB.setEmail(newEmail);
		    Ticket updatedTicket=ticketBookingRepository.save(ticketFromDB);//then saved in repos
		    return updatedTicket ;	
	}
}
