package com.rms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rms.dao.UserRepo;
import com.rms.model.User;

@Service
public class UserServiceImpl implements UserServiceI {

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public User addUser(User user) {
		System.out.println("adding user");
		return userRepo.save(user);
	}

	@Override
	public Iterable<User> getAllUser() {
		System.out.println("fetching all user");
		return userRepo.findAll();
	}

	@Override
	public Optional<User> getSingleUser(int userId) {
		System.out.println("fetching single user");
		return userRepo.findById(userId);
	}

	@Override
	public User editUser(User user, int userId) {
		System.out.println("editing user");
		User u=userRepo.findByUserId(userId);
		u.setFirstName(user.getFirstName());
		u.setLastName(user.getLastName());
		u.setUsername(user.getUsername());
		u.setEmail(user.getEmail());
		u.setAddress(user.getAddress());
		u.setProduct(user.getProduct());
		return userRepo.save(u);
	}

	@Override
	public void deleteUser(int userId) {
		System.out.println("deleting user");
		userRepo.deleteById(userId);
	}

}
