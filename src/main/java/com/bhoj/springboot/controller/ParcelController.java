package com.bhoj.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bhoj.springboot.domain.Parcel;
import com.bhoj.springboot.repository.ParcelRepository;

/**
 * Rest API for Parcel
 * 
 * @author Bhoj Sao
 *
 */
@RestController
@CrossOrigin
public class ParcelController {

	@Autowired
	private ParcelRepository parcelRepository;

	@RequestMapping(value = "/parcel/getAllParcel", method = RequestMethod.GET)
	public ResponseEntity<?> getAllParcel() {
		List<Parcel> parcels = parcelRepository.findAll();
		return new ResponseEntity<List<Parcel>>(parcels, HttpStatus.OK);
	}

	@RequestMapping(value = "/parcel/save", method = RequestMethod.POST)

	public ResponseEntity<?> save(@RequestBody Parcel parcel) {
		
		Parcel dbParcel = parcelRepository.save(parcel);
		return new ResponseEntity<Parcel>(dbParcel, HttpStatus.OK);
	}
}
