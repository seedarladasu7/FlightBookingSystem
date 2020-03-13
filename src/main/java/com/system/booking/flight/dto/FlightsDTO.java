package com.system.booking.flight.dto;

import java.sql.Date;
import java.sql.Time;

public class FlightsDTO {
	
	private String flightName;
	private Date date;
	private Time time;

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}
	
	
	

}
