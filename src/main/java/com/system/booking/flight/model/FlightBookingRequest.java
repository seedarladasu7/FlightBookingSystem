package com.system.booking.flight.model;

import java.sql.Date;
import java.util.List;

import com.system.booking.flight.dto.PassengerDTO;
import com.system.booking.flight.entity.Passenger;

public class FlightBookingRequest {
	
	private int userId;
	private int flightId;
	private Date bookingDate;
	private List<PassengerDTO> passengers;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	public List<PassengerDTO> getPassengers() {
		return passengers;
	}
	public void setPassengers(List<PassengerDTO> passengers) {
		this.passengers = passengers;
	}
	
}
