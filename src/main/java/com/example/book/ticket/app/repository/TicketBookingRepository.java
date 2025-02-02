package com.example.book.ticket.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.book.ticket.app.entity.Ticket;

@Repository
public interface TicketBookingRepository extends CrudRepository<Ticket, Integer>{

}
