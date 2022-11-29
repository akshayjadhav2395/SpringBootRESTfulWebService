package com.rms.service;

import java.util.Optional;

import com.rms.model.User;

public interface UserServiceI {

	public User addUser(User user);
	public Iterable<User> getAllUser();
	public Optional<User> getSingleUser(int userId);
	public User editUser(User user, int userId);
	public void deleteUser(int userId);
}
