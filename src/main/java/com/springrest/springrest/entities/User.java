package com.springrest.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	private String firstname;
	private String lastname;
	private String address;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [Id=" + Id + ", firstname=" + firstname + ", lastname=" + lastname + ", address=" + address + "]";
	}

	public User(long Id, String firstname, String lastname, String address) {
		super();

		this.Id = Id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address=address;
	}

	public User() {
		super();
	}

}
