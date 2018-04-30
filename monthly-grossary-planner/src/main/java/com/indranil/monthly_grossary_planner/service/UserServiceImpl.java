package com.indranil.monthly_grossary_planner.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.indranil.monthly_grossary_planner.dao.UserDAO;
import com.indranil.monthly_grossary_planner.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	// need to inject user dao
	@Autowired
	private UserDAO userDAO;

	@Override
	@Transactional
	public List<User> getUsers() {
		return userDAO.getUsers();
	}

	@Override
	@Transactional
	public void saveUser(User theUser) {
		userDAO.saveUser(theUser);
		
	}

	@Override
	@Transactional
	public User saveUser(int theId) {
		return userDAO.getUser(theId);
	}

}
