package com.mightyhotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mightyhotel.bean.Users;

public interface UsersRepository extends JpaRepository<Users,String>

{

}
