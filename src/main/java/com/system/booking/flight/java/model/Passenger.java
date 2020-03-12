package com.system.booking.flight.java.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "passenger")
public class Passenger {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "sex")
	private String sex;

	@Column(name = "mealpref")
	private String mealpref;

	public Passenger() {}
	
	public Passenger(int id, String name, String sex, String mealpref) {
		this.id = id;
		this.name = name;
		this.sex = sex;
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getMealpref() {
		return mealpref;
	}

	public void setMealpref(String mealpref) {
		this.mealpref = mealpref;
	}

	@Override
	public String toString() {
		return "Passenger [id=" + id + ", name=" + name + ", sex=" + sex + ", mealpref=" + mealpref + "]";
	}

}
