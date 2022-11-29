package com.rms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rms.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
	
	public User findByUserId(int userId);

}
