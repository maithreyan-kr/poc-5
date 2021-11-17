package com.mightyhotel.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mightyhotel.bean.Booking;
import com.mightyhotel.bean.Login;
import com.mightyhotel.bean.Users;
import com.mightyhotel.repository.BookingRepository;
import com.mightyhotel.service.BookingService;
import com.mightyhotel.service.UsersService;

@Controller
public class BookingController {
	
	
		@Autowired
		public BookingService service;
		@Autowired
		BookingRepository bookrepository;
		
		@GetMapping(value="/booking",produces = "application/x-www-form-urlencoded;charset=UTF-8")
		public ModelAndView roombook()
		{
			ModelAndView mv= new ModelAndView("booking");
			//mv.addObject("obj",subject);
			return mv;
		}
		
		@PostMapping("/bookingprocess")
		public ModelAndView booking (Booking book)
		{
		bookrepository.save(book);
		return new ModelAndView("index");

		}
		
}
		
//		@GetMapping("/getdata1")
//		public List<Booking> getAllBooking()
//		{
//			return service.getAllBookings();
//		}
//		@PostMapping(path = "/bookingprocess",consumes = "application/x-www-form-urlencoded;charset=UTF-8")
//		public ModelAndView addBooking(@RequestParam String username, @RequestParam String Roomnumber, @RequestParam String Noofmemberstostay, @RequestParam String checkin, @RequestParam String checkout)
//		{
//			System.out.println(username);
//			Booking book= new Booking();
//			book.setUsername(username);
//			book.setRoomnumber(Roomnumber);
//			book.setNoofmemberstostay(Noofmemberstostay);
//			book.setCheckin(checkin);
//			book.setCheckout(checkout);
//		    service.addBooking(book);
//		    return new ModelAndView("welcome1");
//		}
//		
//	}

	
//@PostMapping("/booking")
//
//public ModelAndView booking (Booking book)
//{
//	System.out.println("entered");
//	Booking booking = book;
//	System.out.println(booking.getUsername());
//	System.out.println(book.getUsername());
//	bookrepository.save(book);
//	return new ModelAndView("index");
//}
//}
//	 @RequestMapping(value = "/bookingprocess", method = RequestMethod.POST)
//	  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
//	      @ModelAttribute("roombook") Booking booking) {
//	    ModelAndView mav = new ModelAndView("index");
//	    bookrepository.save(booking);
//	    return mav;
//	 }}
