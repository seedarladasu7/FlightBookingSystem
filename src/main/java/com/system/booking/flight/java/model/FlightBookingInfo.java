package com.system.booking.flight.java.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flight_booking_info")
public class FlightBookingInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name = "booking_date")
	private Date bookingDate;
	
	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "flight_avail_id")
	private int flightAvailId;
	
	public FlightBookingInfo() {}
	
	public FlightBookingInfo(int id, Date bookingDate, int userId, int flightAvailId) {
		super();
		this.id = id;
		this.bookingDate = bookingDate;
		this.userId = userId;
		this.flightAvailId = flightAvailId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getFlightAvailId() {
		return flightAvailId;
	}

	public void setFlightAvailId(int flightAvailId) {
		this.flightAvailId = flightAvailId;
	}
	
}
