package com.indranil.monthly_grossary_planner.service;

import java.util.List;

import com.indranil.monthly_grossary_planner.entity.User;

public interface UserService {
	
	public List<User> getUsers();

	public void saveUser(User theUser);

	public User saveUser(int theId);

}
