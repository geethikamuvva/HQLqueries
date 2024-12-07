package com.klu;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "emp")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String empName;
	
	@Column(name="designation")
	private String empDesig;
	
	@Column(name="salary")
	private double empSal;
	
	public Employee(int id, String empName, String empDesig, double empSal) {
		super();
		this.id = id;
		this.empName = empName;
		this.empDesig = empDesig;
		this.empSal = empSal;
	}
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public double getEmpSal() {
		return empSal;
	}



	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public void setEmpDesig(String empDesig) {
		this.empDesig = empDesig;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", empDesig=" + empDesig + ", empSal=" + empSal + "]";
	}
	
	
}
