package com.system.booking.flight.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.system.booking.flight.entity.FlightAvailability;

@Repository
public interface FlightAvailabilityRepository extends JpaRepository<FlightAvailability, Integer> {
	 
	public List<FlightAvailability> findBySourceLocAndDestinationLoc(String sourceLoc, String destinationLoc);
	
	public List<FlightAvailability> findBySourceLocAndDestinationLocAndJourneyDate(String sourceLoc, String destinationLoc, Date journerDate);

}
