package com.mightyhotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mightyhotel.bean.Booking;

public interface BookingRepository extends JpaRepository<Booking,String>{

}
