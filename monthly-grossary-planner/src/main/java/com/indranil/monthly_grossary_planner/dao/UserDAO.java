package com.indranil.monthly_grossary_planner.dao;

import java.util.List;

import com.indranil.monthly_grossary_planner.entity.User;

public interface UserDAO {
	
	public List<User> getUsers();

	public void saveUser(User theUser);

	public User getUser(int theId);

}
