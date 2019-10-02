package com.bhoj.springboot.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
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
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;

/**
 * Entity class for Parcel
 * 
 * @author Bhoj
 *
 */
/**
 * @author Bhoj Sao
 *
 */
@Entity
@Table(name = "PARCEL")
@Audited
@EntityListeners(AuditingEntityListener.class)
@Getter
public class Parcel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_SEQUENCE")
	@SequenceGenerator(name = "ID_SEQUENCE", sequenceName = "ID_SEQ")
	@Column(name = "PARCEL_ID")
	@JsonProperty
	private int parcelId;

	@Column(name = "PARCEL_NAME")
	@JsonProperty
	private String parcelName;

	@Column(name = "PARCEL_DESC")
	@JsonProperty
	private String parcelDesc;

	@Column(name = "CURRENT_LOCATION")
	private String currentlocation;

	@Column(name = "ORIGIN")
	@JsonProperty
	private String origin;

	@Column(name = "DESTINATION")
	@JsonProperty
	private String destination;

	@Column(name = "STATE")
	@JsonProperty
	private String state;

	@CreatedBy
	@Column(name = "CREATED_BY")
	@JsonProperty
	private String createdBy;

	@CreatedDate
	@Column(name = "CREATED_DATE", nullable = false, updatable = false)
	@JsonProperty
	private Date createdDate;

	@LastModifiedBy
	@Column(name = "LAST_MODIFIED_BY")
	@JsonProperty
	private String lastModifiedBy;

	@LastModifiedDate
	@Column(name = "LAST_MODIFIED_DATE")
	@JsonProperty
	private Date lastModifiedDate;

	public Parcel() {
		super();
	}

	public Parcel(@JsonProperty("parcelId") int parcelId, @JsonProperty("parcelName") String parcelName,
			@JsonProperty("parcelDesc") String parcelDesc, @JsonProperty("currentlocation") String currentlocation,
			@JsonProperty("origin") String origin, @JsonProperty("destination") String destination,
			@JsonProperty("state") String state, @JsonProperty("createdBy") String createdBy,
			@JsonProperty("createdDate") Date createdDate, @JsonProperty("lastModifiedBy") String lastModifiedBy,
			@JsonProperty("lastModifiedDate") Date lastModifiedDate) {
		super();
		this.parcelId = parcelId;
		this.parcelName = parcelName;
		this.parcelDesc = parcelDesc;
		this.currentlocation = currentlocation;
		this.origin = origin;
		this.destination = destination;
		this.state = state;
		this.createdBy = getCreatedBy();
		this.createdDate = getCreatedDate();
		this.lastModifiedBy = getLastModifiedBy();
		this.lastModifiedDate = getLastModifiedDate();
	}

	public Date getCreatedDate() {
			return new Date();
	}

	public String getCreatedBy() {
		return "SID";
	}

	public String getLastModifiedBy() {
		return "BHOJ";
	}

	public Date getLastModifiedDate() {
		return new Date();
	}

}
