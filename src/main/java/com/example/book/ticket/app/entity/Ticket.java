package com.example.book.ticket.app.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ticket")
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//auto, identity for default value
	@Column(name="Ticket_Id")
	private Integer ticketId;
	@Column(name="Passenger_Name", nullable=false)
	private String passengerName;
	@Column(name="email_id")
	private String email;
	@Column(name="Booking_Date")
	private Date bookingDate;
	@Column(name="Source_Station")
	private String sourceStation;
	@Column(name="Destination_Station")
	private String destinationStation;
	

	
	public Ticket() {
		super();
	}


	public Ticket(Integer ticketId, String passengerName, String email, Date bookingDate, String sourceStation,
			String destinationStation) {
		super();
		this.ticketId = ticketId;
		this.passengerName = passengerName;
		this.email = email;
		this.bookingDate = bookingDate;
		this.sourceStation = sourceStation;
		this.destinationStation = destinationStation;
	}


	public Integer getTicketId() {
		return ticketId;
	}
	
	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}
	public String getPassengerName() {
		return passengerName;
	}
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getSourceStation() {
		return sourceStation;
	}
	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}
	public String getDestinationStation() {
		return destinationStation;
	}
	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}


	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", passengerName=" + passengerName + ", email=" + email
				+ ", bookingDate=" + bookingDate + ", sourceStation=" + sourceStation + ", destinationStation="
				+ destinationStation + "]";
	}
	
	
	
}
