package com.system.booking.flight.dto;

public class PassengerDTO {

	private int id;
	private String name;
	private String gender;
	private String mealpref;
	private int bookingid;

	public PassengerDTO() {
	}

	public PassengerDTO(int id, String name, String gender, String mealpref) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.mealpref = mealpref;
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
