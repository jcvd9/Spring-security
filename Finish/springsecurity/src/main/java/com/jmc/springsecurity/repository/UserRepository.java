package com.jmc.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jmc.springsecurity.models.User;

@Repository

public interface UserRepository extends JpaRepository<User, Integer>{
	
	
	User findByUsername(String username);


}
