package com.system.booking.flight.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.system.booking.flight.entity.FlightBooking;

public interface FlightBookingRepository extends JpaRepository<FlightBooking, Integer>{

}
