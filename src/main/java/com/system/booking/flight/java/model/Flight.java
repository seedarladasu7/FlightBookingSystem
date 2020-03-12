package com.system.booking.flight.java.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="flight")
public class Flight {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "flight_id", insertable = false, updatable = false)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@OneToMany(mappedBy = "flight")
	@JsonManagedReference
	private Set<FlightAvailability> flightAvailability;
	
	public Flight() {}
			
	public Flight(int id, String name) {
		this.id = id;
		this.name = name;
	}

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
	
	public Set<FlightAvailability> getFlightAvailability() {
		return flightAvailability;
	}

	public void setFlightAvailability(Set<FlightAvailability> flightAvailability) {
		this.flightAvailability = flightAvailability;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}

}
