package com.bhoj.springboot.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.envers.RevisionEntity;
import org.hibernate.envers.RevisionNumber;
import org.hibernate.envers.RevisionTimestamp;

import com.bhoj.springboot.listener.EntityRevisionListener;

/**
 * RevisionsEntity Class
 * 
 * @author Bhoj
 *
 */
@Entity
@Table(name = "CUSTOM_REVISION_INFO")
@RevisionEntity(value = EntityRevisionListener.class)
public class CustomRevisionInfo implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "ID_SEQUENCE")
	@SequenceGenerator(name = "ID_SEQUENCE", sequenceName = "ID_SEQ")
	@Column(name="REV")
	@RevisionNumber
	private int rev;
	
	@RevisionTimestamp
	@Column(name="TIMESTAMP")
	private long timestamp;

}
