package com.developairs.demo.service;

import com.developairs.demo.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
	public void updateUserWithHashedPass(User user);
}
