package com.bhoj.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bhoj.springboot.domain.Parcel;

/**
 * ParcelRepository
 * 
 * @author Bhoj
 *
 */
@Repository
public interface ParcelRepository extends JpaRepository<Parcel, String> {

}
