package com.system.booking.flight.service.impl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.booking.flight.dto.FlightsDTO;
import com.system.booking.flight.dto.PassengerDTO;
import com.system.booking.flight.entity.FlightAvailability;
import com.system.booking.flight.entity.FlightBooking;
import com.system.booking.flight.entity.Passenger;
import com.system.booking.flight.model.FlightBookingRequest;
import com.system.booking.flight.repository.FlightAvailabilityRepository;
import com.system.booking.flight.repository.FlightBookingRepository;
import com.system.booking.flight.service.FlightService;

@Service
public class FlightServiceImpl implements FlightService {

	@Autowired
	FlightAvailabilityRepository flightsAvailRepository;
	
	@Autowired
	FlightBookingRepository flightBookingRepository;

	@Override
	public List<FlightsDTO> getAvailableflights(String source, String destination, Date journeyDate,
			String searchWithDate) {
		List<FlightsDTO> fDTOList = new ArrayList<>();
		List<FlightAvailability> flights = null;

		if (searchWithDate.equalsIgnoreCase("YES")) {
			flights = flightsAvailRepository.findBySourceLocAndDestinationLocAndJourneyDate(source, destination,
					journeyDate);
		} else {
			flights = flightsAvailRepository.findBySourceLocAndDestinationLoc(source, destination);
		}

		for (FlightAvailability flight : flights) {
			FlightsDTO fDTO = new FlightsDTO();
			String flightName = flight.getFlight().getName();
			fDTO.setFlightName(flightName);
			fDTO.setDate(flight.getJourneyDate());
			fDTO.setTime(flight.getJourneyTime());
			fDTOList.add(fDTO);
		}

		return fDTOList;
	}

	@Override
	public boolean bookFlightWithPassengers(FlightBookingRequest request) {
		
		FlightBooking booking = new FlightBooking();
		
		booking.setDate(request.getBookingDate());
		booking.setFlightId(request.getFlightId());
		booking.setUserId(request.getUserId());
		List<Passenger> psList = new ArrayList<>();
		if(request.getPassengers() != null && !request.getPassengers().isEmpty()) {
			for(PassengerDTO dto: request.getPassengers()) {
				Passenger passenger = new Passenger();
				passenger.setName(dto.getName());
				passenger.setGender(dto.getGender());
				passenger.setMealpref(dto.getMealpref());
				psList.add(passenger);
			}
		}
		
		booking.setPassengers(psList);
		flightBookingRepository.save(booking);
		
		
		
		
		return false;
	}
	
	

}
