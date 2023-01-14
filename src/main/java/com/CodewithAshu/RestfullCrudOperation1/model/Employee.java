package com.CodewithAshu.RestfullCrudOperation1.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Data
@Table(name="Employee_Details")

public class Employee {
	@Id
	@Column(name="Employee_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="Employee_Name")
	private String name;
	@Column(name="Employee_Address")
	private String address;
	@Column(name="Employee_Email")
	private String email;
	@Column(name="Employee_Salary")
	private double salary;
	@Column(name="Employee_Age")
	private int age;
	
	@Column(name="Create_date",updatable =  false)
	@CreationTimestamp
	private LocalDate createdate;
	
	@Column(name="update_date", insertable = false)
	@UpdateTimestamp
	private LocalDate updatedate;
	
	@Column(name="isactive_switch")
	private String isactive;
	

}
