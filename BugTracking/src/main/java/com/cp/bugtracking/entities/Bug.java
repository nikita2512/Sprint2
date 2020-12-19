package com.cp.bugtracking.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bug_tbl")
public class Bug {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "bug_id")
	private long bugId;

	@Column(name = "bug_desc")
	private String bugDesc;

	@Column(name = "status")
	private String status;

	@Column(name = "start_date")
	private Date startDate;

	@Column(name = "end_date")
	private Date endDate;

	@Column(name = "assignee")
	private String assignee;

	@Column(name = "type")
	private String type;

	@Column(name = "priority")
	private String priority;



	// BugId
	public long getBugId() {
		return bugId;
	}

	public void setBugId(long bugId) {
		this.bugId = bugId;
	}

	// BugDesc
	public String getBugDesc() {
		return bugDesc;
	}

	public void setBugDesc(String bugDesc) {
		this.bugDesc = bugDesc;
	}

	// BugStatus
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	// StartDate
	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	// EndDate
	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	// Assignee
	public String getAssignee() {
		return assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	// Bug Type
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	// Priority
	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	
	
	//Constructors
	public Bug() {

	}

	public Bug(String bugDesc, String status, Date startDate, Date endDate, String assignee, String type,
			String priority) {
		super();
		this.bugDesc = bugDesc;
		this.status = status;
		this.startDate = startDate;
		this.endDate = endDate;
		this.assignee = assignee;
		this.type = type;
		this.priority = priority;
	}

}