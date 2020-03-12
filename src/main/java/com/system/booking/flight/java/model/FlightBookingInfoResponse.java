package com.system.booking.flight.java.model;

import java.util.List;

public class FlightBookingInfoResponse {
	
	private String flightName;
	private List<BookingForPassengersResposne> bookingDetails;
	
	public FlightBookingInfoResponse() {}
	
	public FlightBookingInfoResponse(String flightName, List<BookingForPassengersResposne> bookingDetails) {
		this.flightName = flightName;
		this.bookingDetails = bookingDetails;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public List<BookingForPassengersResposne> getBookingDetails() {
		return bookingDetails;
	}

	public void setBookingDetails(List<BookingForPassengersResposne> bookingDetails) {
		this.bookingDetails = bookingDetails;
	}

}
