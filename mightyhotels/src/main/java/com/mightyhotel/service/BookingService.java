package com.mightyhotel.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mightyhotel.bean.Booking;

import com.mightyhotel.repository.BookingRepository;

@Service
public class BookingService {
	
	@Autowired
	public BookingRepository bookrepo;
	public List<Booking> getAllBookings()
	{
		List<Booking> booking = new ArrayList<>();
		bookrepo.findAll().forEach(booking::add);
		System.out.println(booking);
		return booking;	
	}
	public void addBooking(Booking booking) 
	{
		bookrepo.save(booking);
		
	}
	
	
//	public void updateSubject(String username, Booking book) {
//		bookrepo.save(book);
//		
//	}
//
//	public void deleteSubject(String username) {
//		subjectRepo.deleteById(username);
//		
//	}
//	public Subject validateSubject(Login login) {
//	Subject user = subjectRepo.getById(login.username);
//	if(user.getPassword().equals(login.password)) {
//	
//	return user;
//	}
//	else{
//	
//	return null;
//	}
//	
//	}
	public void updateSubject(String Roomstatus, Booking booking) {
		bookrepo.save(booking);
	}

}
