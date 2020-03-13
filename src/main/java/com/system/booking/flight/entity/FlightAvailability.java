package com.system.booking.flight.entity;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="flight_availability")
public class FlightAvailability {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ft_avail_id")
	private int id;
	
	@Column(name = "journey_date")
	private Date journeyDate;
	
	@Column(name = "journey_time")
	private Time journeyTime;
	
	@Column(name = "source_loc")
	private String sourceLoc;
	
	@Column(name = "destination_loc")
	private String destinationLoc;
	
	@ManyToOne
	@JoinColumn(name = "flight_id", nullable = false, insertable = false, updatable = false)
	@JsonBackReference
	private Flight flight;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}

	public String getSourceLoc() {
		return sourceLoc;
	}

	public void setSourceLoc(String sourceLoc) {
		this.sourceLoc = sourceLoc;
	}

	public String getDestinationLoc() {
		return destinationLoc;
	}

	public void setDestinationLoc(String destinationLoc) {
		this.destinationLoc = destinationLoc;
	}
	
	public Time getJourneyTime() {
		return journeyTime;
	}

	public void setJourneyTime(Time journeyTime) {
		this.journeyTime = journeyTime;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
}
