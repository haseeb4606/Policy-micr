package com.policymicroservice.dtos;

import java.io.Serializable;
import java.util.Date;

public class PolicyDto implements Serializable {
	private static final long serialVersionUID = 3248917713969658188L;
	private Integer id;
	private String polNumber;
	private String type;
	private Date startDate;
	private Date endDate;
	private Boolean isActive;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPolNumber() {
		return polNumber;
	}

	public void setPolNumber(String polNumber) {
		this.polNumber = polNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

}
