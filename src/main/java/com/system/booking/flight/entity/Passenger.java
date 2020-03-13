package com.system.booking.flight.entity;

import javax.persistence.CascadeType;
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
@Table(name = "passenger")
public class Passenger {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "passid")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "gender")
	private String gender;

	@Column(name = "mealpref")
	private String mealpref;
	
	@Column(name = "bookingid")
	private int bookingid;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bookingid", nullable = false, insertable = false, updatable = false)
	@JsonBackReference
	private FlightBooking flightBooking;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMealpref() {
		return mealpref;
	}

	public void setMealpref(String mealpref) {
		this.mealpref = mealpref;
	}

	public int getBookingid() {
		return bookingid;
	}

	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
}
