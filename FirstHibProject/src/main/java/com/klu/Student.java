package com.klu;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sid;
	
	@Column(name="name")
	private String sname;
	
	private String email;
	private String address;
	
	public Student(int sid, String sname, String email, String address) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.email = email;
		this.address = address;
	}
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", email=" + email + ", address=" + address + "]";
	}
	
	
	
	
}
