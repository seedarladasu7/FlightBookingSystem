package com.system.booking.flight.java.model;

import java.util.List;

public class UserFlightBookingInfoResponse {
	
	private List<FlightBookingInfoResponse> flightBookingInfo;
	
	public UserFlightBookingInfoResponse() {}
	
	public UserFlightBookingInfoResponse(List<FlightBookingInfoResponse> flightBookingInfo) {
		this.flightBookingInfo = flightBookingInfo;
	}

	public List<FlightBookingInfoResponse> getFlightBookingInfo() {
		return flightBookingInfo;
	}

	public void setFlightBookingInfo(List<FlightBookingInfoResponse> flightBookingInfo) {
		this.flightBookingInfo = flightBookingInfo;
	}
	
	

}
