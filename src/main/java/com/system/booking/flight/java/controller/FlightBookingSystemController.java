package com.system.booking.flight.java.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.system.booking.flight.java.model.FlightAvailability;
import com.system.booking.flight.java.model.FlightBookingInfoResponse;
import com.system.booking.flight.java.model.SearchFlightsResponse;
import com.system.booking.flight.java.model.SearchRequest;
import com.system.booking.flight.java.model.UserFlightBookingInfoResponse;
import com.system.booking.flight.java.repository.SearchFlightsRepository;

@RestController
@RequestMapping("/")
public class FlightBookingSystemController {

	@Autowired
	SearchFlightsRepository searchFlightsRepository;

	@GetMapping("/getAvailFlights")
	public List<SearchFlightsResponse> getAvailableFlights(@RequestBody SearchRequest request) {

		List<FlightAvailability> flights = null;
		List<FlightBookingInfoResponse> info = new ArrayList<>();

		if (request.getSearchWithDate().equalsIgnoreCase("YES")) {
			flights = searchFlightsRepository.findBySourceLocAndDestinationLocAndJourneyDate(request.getSource(),
					request.getDestination(), request.getJourneyDate());
		} else {
			flights = searchFlightsRepository.findBySourceLocAndDestinationLoc(request.getSource(),
					request.getDestination());
		}
		
		List<SearchFlightsResponse> respList = new ArrayList<>();
		
		for(FlightAvailability fAvai : flights) {			
			SearchFlightsResponse resp = new SearchFlightsResponse();			
			String flightName = fAvai.getFlight().getName();
			resp.setFlightName(flightName);			
			resp.setDate(fAvai.getJourneyDate());
			resp.setTime(fAvai.getJourneyTime());
			
			respList.add(resp);
			
		}
		
		

		return respList;
	}

	@GetMapping("/getBookedFlights")
	public UserFlightBookingInfoResponse getBookedFlights(@RequestBody SearchRequest request) {

		List<FlightBookingInfoResponse> info = new ArrayList<>();

		for (int i = 0; i < 3; i++) {

			FlightBookingInfoResponse bookingInfo = new FlightBookingInfoResponse();
			bookingInfo.setFlightName("AirAsia");

			info.add(bookingInfo);
		}

		return new UserFlightBookingInfoResponse(info);
	}
}
