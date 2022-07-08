package com.tut.HibernateD;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="Student_Address")
public class Address {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int addressId;
	@Column(name="STREET")
	private String street;
	@Column(name="City")
	private String city;
	@Column(name="is_Open")
	private boolean isOpen;
	@Transient
	private int x;
	@Temporal(TemporalType.DATE)
	private Date date;
	
	
	public Address() {
		super();
	}


	

	public Address(int addressId, String street, String city, boolean isOpen, int x, Date date) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.x = x;
		this.date = date;
	}




	public int getAddressId() {
		return addressId;
	}


	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public boolean isOpen() {
		return isOpen;
	}


	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}
	


	public Date getDate() {
		return date;
	}




	public void setDate(Date date) {
		this.date = date;
	}




	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", street=" + street + ", city=" + city + ", isOpen=" + isOpen
				+ ", x=" + x + ", date=" + date + "]";
	}





	
	

}
