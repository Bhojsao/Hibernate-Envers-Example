package com.bhoj.springboot.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.envers.Audited;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Data;

/**
 * Entity class for Parcel
 * 
 * @author Bhoj
 *
 */
@Entity
@Table(name = "PARCEL")
@Data
@Audited
public class Parcel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "ID_SEQUENCE")
	@SequenceGenerator(name = "ID_SEQUENCE", sequenceName = "ID_SEQ")
	@Column(name = "PARCEL_ID")
	private int parcelId;

	@Column(name = "PARCEL_NAME")
	private String parcelName;

	@Column(name = "PARCEL_DESC")
	private String parcelDesc;
	
	@Column(name = "CURRENT_LOCATION" )
	private String currentlocation;
	
	@Column(name = "ORIGIN")
	private String origin;
	
	@Column(name = "DESTINATION" )
	private String destination;
	
	@Column(name = "STATE")
	private String state;
	
	@CreatedBy
	@Column(name = "CREATED_BY" )
    private String createdBy;
	
	@CreatedDate
	@Column(name = "CREATED_DATE")
	private Date createdDate;
	
	@LastModifiedBy
	@Column(name = "LAST_MODIFIED_BY")
    private String lastModifiedBy;
	
	@LastModifiedDate
	@Column(name = "LAST_MODIFIED_DATE")
	private Date lastModifiedDate;

}
