package com.mightyhotel.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mightyhotel.bean.Login;
import com.mightyhotel.bean.Users;
import com.mightyhotel.repository.UsersRepository;
@org.springframework.stereotype.Service
public class UsersService 
{
	@Autowired
	public UsersRepository subjectRepo;
	public List<Users> getAllSubjects()
	{
		List<Users> subjects = new ArrayList<>();
		subjectRepo.findAll().forEach(subjects::add);
		System.out.println(subjects);
		return subjects;	
	}
	public void addSubject(Users subject) 
	{
		subjectRepo.save(subject);
		
	}
	
	
	public void updateSubject(String username, Users subject) {
		subjectRepo.save(subject);
		
	}

	public void deleteSubject(String username) {
		subjectRepo.deleteById(username);
		
	}
	public Users validateSubject(Login login) {
	Users user = subjectRepo.getById(login.username);
	if(user.getPassword().equals(login.password)) {
	
	return user;
	}
	else{
	
	return null;
	}


	


}}
