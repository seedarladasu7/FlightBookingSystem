package com.system.booking.flight.model;

import java.sql.Date;
import java.util.List;

import com.system.booking.flight.entity.Passenger;

public class BookingForPassengersResposne {
	
	private int bookingId;
	private Date bookingDate;
	private List<Passenger> passengers;

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public List<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}
	
}
