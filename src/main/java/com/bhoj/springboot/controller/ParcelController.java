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
import org.springframework.web.util.UriComponentsBuilder;

import com.bhoj.springboot.domain.Parcel;
import com.bhoj.springboot.repository.ParcelRepository;

/**
 * Rest API for Parcel
 * 
 * @author Bhoj Sao
 *
 */
@RestController
public class ParcelController {

	@Autowired
	private ParcelRepository parcelRepository;

	@RequestMapping(value = "/parcel/getAllParcel", method = RequestMethod.GET)
	@CrossOrigin
	public ResponseEntity<?> getAllParcel() {
		List<Parcel> parcels = parcelRepository.findAll();
		return new ResponseEntity<List<Parcel>>(parcels, HttpStatus.OK);
	}

	@RequestMapping(value = "/parcel/save", method = RequestMethod.POST)
	@CrossOrigin
	public ResponseEntity<?> save(@RequestBody Parcel parcel, UriComponentsBuilder ucBuilder) {
		parcelRepository.save(parcel);
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}
}
