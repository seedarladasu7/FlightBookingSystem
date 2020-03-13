package com.system.booking.flight.service;

import java.sql.Date;
import java.util.List;

import com.system.booking.flight.dto.FlightsDTO;
import com.system.booking.flight.model.FlightBookingRequest;

public interface FlightService {
	
	public List<FlightsDTO> getAvailableflights(String source, String destination, Date journeyDate, String searchWithDate);
	
	public boolean bookFlightWithPassengers(FlightBookingRequest request);

}
