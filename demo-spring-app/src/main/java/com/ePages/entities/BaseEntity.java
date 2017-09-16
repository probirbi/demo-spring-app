package com.ePages.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public abstract class BaseEntity {
	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedDate;

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	
	@PrePersist
	@PreUpdate
	public void preUpdateOrCreate(){
		createdDate = createdDate == null ? new Date() : createdDate;
		updatedDate = new Date();
	}
}
