package com.iclique.crudfull.model;

public class User {
	
	int id;
	String name;
	String email;
	String country;
	int contact;
	String address;

	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String name, String email, String country, int contact, String address) {
		this.name = name;
		this.email = email;
		this.country = country;
		this.contact = contact;
		this.address = address;
	}
	public User(int id, String name, String email, String country, int contact, String address) {
		this(name, email, country, contact, address);
		this.id = id;
	}

	public User(int id) {
		// TODO Auto-generated constructor stub
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

}
