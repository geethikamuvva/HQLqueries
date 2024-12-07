package com.klef.jfsd.exam;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "cus")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String cusName;
	
	@Column(name="email")
	private String cusEmail;
	
	@Column(name="age")
	private int cusAge;
	
	@Column(name="location")
	private String cusLocation;
	
	public Customer(int id, String cusName, String cusEmail, int cusAge, String cusLocation) {
		super();
		this.id = id;
		this.cusName = cusName;
		this.cusEmail = cusEmail;
		this.cusAge = cusAge;
		this.cusLocation = cusLocation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public String getCusEmail() {
		return cusEmail;
	}

	public void setCusEmail(String cusEmail) {
		this.cusEmail = cusEmail;
	}

	public int getCusAge() {
		return cusAge;
	}

	public void setCusAge(int cusAge) {
		this.cusAge = cusAge;
	}

	public String getCusLocation() {
		return cusLocation;
	}

	public void setCusLocation(String cusLocation) {
		this.cusLocation = cusLocation;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", cusName=" + cusName + ", cusEmail=" + cusEmail + ", cusAge=" + cusAge
				+ ", cusLocation=" + cusLocation + "]";
	}
	
	
	
	
}
