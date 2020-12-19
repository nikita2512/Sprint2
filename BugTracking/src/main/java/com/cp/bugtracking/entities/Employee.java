package com.cp.bugtracking.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="employee_tbl")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="employee_id",length=10)
	private long empId;
	
	@Column(name="employee_name",length=50)
	@NotEmpty(message = "Please provide a name")
	private String empName;
	
	@NotEmpty(message = "Please provide an email")
	private String email;
	
	@NotEmpty(message = "Please provide a contact")
	private String empContact;
	
	@NotEmpty(message = "Please provide a status")
	private String empStatus;
	
	
	
	

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "employee_id")
	private List<Bug> bugList = new ArrayList<>();

	//BugList
	public List<Bug> getBugList() {
		return bugList;
	}

	public void setBugList(List<Bug> bugList) {
		this.bugList = bugList;
	}


	public Employee() {
		
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmpContact() {
		return empContact;
	}

	public void setEmpContact(String empContact) {
		this.empContact = empContact;
	}

	public String getEmpStatus() {
		return empStatus;
	}

	public void setEmpStatus(String empStatus) {
		this.empStatus = empStatus;
	}

	public Employee(@NotEmpty(message = "Please provide a name") String empName,
			@NotEmpty(message = "Please provide an email") String email,
			@NotEmpty(message = "Please provide a contact") String empContact,
			@NotEmpty(message = "Please provide a status") String empStatus) {
		super();
		this.empName = empName;
		this.email = email;
		this.empContact = empContact;
		this.empStatus = empStatus;
	}
	
	

	
}


