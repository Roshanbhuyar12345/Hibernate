package com.tut.HibernateD;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int id;
	private String name;
	private String city;
	private long mobile_num;

	public Student(int id, String name, String city, long mobile_num) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.mobile_num = mobile_num;
	}

	public Student() {

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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getMobile_num() {
		return mobile_num;
	}

	public void setMobile_num(long mobile_num) {
		this.mobile_num = mobile_num;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", mobile_num=" + mobile_num + "]";
	}

	
}
