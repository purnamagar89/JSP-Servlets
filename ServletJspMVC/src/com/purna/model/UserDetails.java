package com.purna.model;

public class UserDetails {

	private int id;
	private String fullName;
	private String city;
	private String street;
	private String zip;
	private String state;

	public UserDetails() {
	}

	public UserDetails(int id, String fullName, String city, String street, String zip, String state) {
		this.id = id;
		this.fullName = fullName;
		this.city = city;
		this.street = street;
		this.zip = zip;
		this.state = state;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
