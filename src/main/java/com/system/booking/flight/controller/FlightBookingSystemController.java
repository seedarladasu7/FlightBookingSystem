package com.system.booking.flight.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.system.booking.flight.dto.FlightsDTO;
import com.system.booking.flight.entity.FlightAvailability;
import com.system.booking.flight.model.FlightBookingRequest;
import com.system.booking.flight.model.FlightBookingInfoResponse;
import com.system.booking.flight.model.SearchRequest;
import com.system.booking.flight.model.UserFlightBookingInfoResponse;
import com.system.booking.flight.repository.FlightAvailabilityRepository;
import com.system.booking.flight.service.FlightService;

@RestController
public class FlightBookingSystemController {

	private static SimpleDateFormat dateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private static SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
	private static SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");

	@Autowired
	FlightService flightService;

	@GetMapping("/getFlights/{source}/{destination}/{journeyDate}")
	public ResponseEntity<List<FlightsDTO>> getAvailableFlights(@PathVariable("source") String source,
			@PathVariable("destination") String destination, @PathVariable("journeyDate") Date journeyDate,
			@RequestParam("searchWithDate") String searchWithDate) {

		List<FlightsDTO> respList = flightService.getAvailableflights(source, destination, journeyDate, searchWithDate);

		return new ResponseEntity<>(respList, HttpStatus.OK);
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

	@PostMapping("/bookFlight")
	public String bookFlightWithPassengers(@RequestBody FlightBookingRequest request) {
		
		flightService.bookFlightWithPassengers(request);
		

		return "Still in progress";

	}
}
