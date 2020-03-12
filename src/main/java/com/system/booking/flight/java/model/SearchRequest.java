package com.system.booking.flight.java.model;

import java.sql.Date;

public class SearchRequest {
	
	private String source;
	private String destination;
	private Date journeyDate;
	private String searchWithDate;
	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Date getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}
	public String getSearchWithDate() {
		return searchWithDate;
	}
	public void setSearchWithDate(String searchWithDate) {
		this.searchWithDate = searchWithDate;
	}
	
	
	
}
