package com.mightyhotel.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mightyhotel.bean.Users;
import com.mightyhotel.service.UsersService;



@RestController
public class UsersController 
{
	@Autowired
	private UsersService service;
	
	@GetMapping(value="/register",produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView home()
	{
		ModelAndView mv= new ModelAndView("register");
		//mv.addObject("obj",subject);
		return mv;
	}
	
	@GetMapping("/getdata")
	public List<Users> getAllSubjects()
	{
		return service.getAllSubjects();
	}
	@PostMapping(path = "/register",consumes = "application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView addSubject(@RequestParam String username, @RequestParam String password, @RequestParam String firstname, @RequestParam String lastname, @RequestParam String email, @RequestParam long phone )
	{
		System.out.println(firstname + " " + lastname);
		Users sub= new Users();
		sub.setUsername(username);
		sub.setEmail(email);
		sub.setFirstname(firstname);
		sub.setLastname(lastname);
		sub.setPassword(password);
		sub.setPhone(phone);
	    service.addSubject(sub);
	    
	    System.out.println( "welcome " + sub.getFirstname() + " "  + sub.getLastname());
	    
	    return new ModelAndView("login");
	}
	
}
